package eb.livrodeferias.projeto.controller;

import eb.livrodeferias.projeto.entities.PerfilMilitar;
import eb.livrodeferias.projeto.services.PerfilMilitarService;
import eb.livrodeferias.projeto.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerfilMilitarController {

    @Autowired
    private PerfilMilitarService perfilMilitarService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<PerfilMilitar> findById(@PathVariable PerfilMilitar identidadeMilitar) throws ObjectNotFoundException {
        return perfilMilitarService.listIdentidade(identidadeMilitar);
    }
}
