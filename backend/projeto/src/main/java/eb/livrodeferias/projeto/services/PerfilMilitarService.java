package eb.livrodeferias.projeto.services;

import eb.livrodeferias.projeto.domain.Cidade;
import eb.livrodeferias.projeto.domain.Endereco;
import eb.livrodeferias.projeto.domain.PerfilMilitar;
import eb.livrodeferias.projeto.domain.enums.PostoGraduacao;
import eb.livrodeferias.projeto.dto.PerfilMilitarNewDTO;
import eb.livrodeferias.projeto.repositories.EnderecoRepository;
import eb.livrodeferias.projeto.repositories.PerfilMilitarRepository;
import eb.livrodeferias.projeto.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilMilitarService {

    @Autowired
    private PerfilMilitarRepository perfilMilitarRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public PerfilMilitar find(Integer id){
        Optional<PerfilMilitar> obj = perfilMilitarRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
           "Objeto não encontrado! Id: "+ id + ", Tipo: "+ PerfilMilitar.class.getName()
        ));
    }

    @Transactional
    public PerfilMilitar insert(PerfilMilitar obj) {
        obj.setId(null);
        obj = perfilMilitarRepository.save(obj);
        enderecoRepository.saveAll(obj.getEnderecos());

        return obj;
    }

    public List<PerfilMilitar> findAll() {
        return perfilMilitarRepository.findAll();
    }

    public Page<PerfilMilitar> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return perfilMilitarRepository.findAll(pageRequest);
    }

    public PerfilMilitar fromDTO(PerfilMilitarNewDTO objDto) {
        PerfilMilitar cli = new PerfilMilitar(null, objDto.getIdentidadeMilitar(), objDto.getNomeDoMilitar(), PostoGraduacao.toEnum(objDto.getPostoEGraduacao()),
                objDto.getSecao(), objDto.getTelefone(), objDto.getRamal());
        Cidade cid = new Cidade(objDto.getCidadeId(), null, null);
        Endereco end = new Endereco(null, objDto.getRua(), objDto.getNumero(), objDto.getComplemento(), objDto.getBairro(), objDto.getCep(), cli, cid);
        cli.getEnderecos().add(end);
        cli.getTelefones().add(objDto.getTelefone());

        return cli;
    }
}
