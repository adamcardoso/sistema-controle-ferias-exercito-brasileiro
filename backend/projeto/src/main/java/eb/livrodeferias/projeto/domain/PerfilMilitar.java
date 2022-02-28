package eb.livrodeferias.projeto.domain;

import eb.livrodeferias.projeto.domain.enums.PostoGraduacao;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
public class PerfilMilitar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter private Integer id;

    @Getter @Setter private String identidadeMilitar;
    @Getter @Setter private String nomeDoMilitar;
    @Getter @Setter private Integer postoEGraduacao;
    @Getter @Setter private String secao;
    @Getter @Setter private String telefone;
    @Getter @Setter private String ramal;

    @OneToMany(mappedBy = "militar", cascade = CascadeType.ALL)
    @Getter @Setter private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="TELEFONE")
    @Getter @Setter private Set<String> telefones = new HashSet<>();

    public PerfilMilitar(Integer id, String identidadeMilitar, String nomeDoMilitar, PostoGraduacao postoEGraduacao, String secao, String telefone, String ramal) {
        this.id = id;
        this.identidadeMilitar = identidadeMilitar;
        this.nomeDoMilitar = nomeDoMilitar;
        this.postoEGraduacao = (postoEGraduacao == null) ? null : postoEGraduacao.getCod();
        this.secao = secao;
        this.telefone = telefone;
        this.ramal = ramal;
    }
}
