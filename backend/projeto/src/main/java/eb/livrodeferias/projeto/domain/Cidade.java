package eb.livrodeferias.projeto.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter private Integer id;
    @Getter @Setter private String name;

    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;
}
