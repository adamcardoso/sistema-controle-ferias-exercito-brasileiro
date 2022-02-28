package eb.livrodeferias.projeto.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Estado  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter private Integer id;

    @Getter @Setter private String name;

    @JsonIgnore
    @OneToMany(mappedBy="estado")
    private List<Cidade> cidades = new ArrayList<>();
}
