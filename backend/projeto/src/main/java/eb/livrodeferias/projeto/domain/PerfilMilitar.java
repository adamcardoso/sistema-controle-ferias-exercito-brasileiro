package eb.livrodeferias.projeto.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PerfilMilitar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer identidadeMilitar;
    private String nomeDoMilitar;
    private String postoMilitar;
    private String graduacaoMilitar;
    private String secao;
    private String ramal;

    @OneToMany(mappedBy="militar", cascade=CascadeType.ALL)
    private List<PerfilMilitarEndereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="TELEFONE")
    private Set<String> telefones = new HashSet<>();
}
