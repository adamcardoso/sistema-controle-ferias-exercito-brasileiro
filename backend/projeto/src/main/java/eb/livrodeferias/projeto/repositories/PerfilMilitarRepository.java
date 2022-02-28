package eb.livrodeferias.projeto.repositories;

import eb.livrodeferias.projeto.domain.PerfilMilitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PerfilMilitarRepository extends JpaRepository<PerfilMilitar, Integer> {

    @Transactional(readOnly=true)
    PerfilMilitar findByIdentidadeMilitar(String identidadeMilitar);
}
