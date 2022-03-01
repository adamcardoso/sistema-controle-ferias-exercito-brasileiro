package eb.livrodeferias.projeto.services;

import eb.livrodeferias.projeto.entities.Cidade;
import eb.livrodeferias.projeto.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> findByEstado(Integer estadoId){
        return  cidadeRepository.findCidades(estadoId);
    }
}
