package eb.livrodeferias.projeto.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PerfilMilitar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter private Integer id;

    @Getter @Setter private String identidadeMilitar;
    @Getter @Setter private String nomeDoMilitar;
    @Getter @Setter private String postoMilitar;
    @Getter @Setter private String graduacaoMilitar;
    @Getter @Setter private String secao;
    @Getter @Setter private String ramal;

    @OneToMany(mappedBy="militar", cascade=CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="TELEFONE")
    private Set<String> telefones = new HashSet<>();
}
