package eb.livrodeferias.projeto.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PerfilMilitarEndereco implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter private Integer id;

    @Getter @Setter private String rua;
    @Getter @Setter private String numero;
    @Getter @Setter private String cep;
    @Getter @Setter private String complemento;
    @Getter @Setter private String bairro;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="militar_id")
    private PerfilMilitar perfilMilitar;


    @ManyToOne
    @JoinColumn(name="cidade_id")
    private Cidade cidade;
}
