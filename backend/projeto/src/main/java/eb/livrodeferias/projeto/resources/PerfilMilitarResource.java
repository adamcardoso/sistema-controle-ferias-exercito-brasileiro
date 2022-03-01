package eb.livrodeferias.projeto.resources;

import eb.livrodeferias.projeto.entities.PerfilMilitar;
import eb.livrodeferias.projeto.dto.PerfilMilitarNewDTO;
import eb.livrodeferias.projeto.services.PerfilMilitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value="/militares")
public class PerfilMilitarResource {

    @Autowired
    private PerfilMilitarService perfilMilitarService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<PerfilMilitar> find(@PathVariable Integer id) {
        PerfilMilitar obj = perfilMilitarService.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody PerfilMilitarNewDTO objDto) {
        PerfilMilitar obj = perfilMilitarService.fromDTO(objDto);
        obj = perfilMilitarService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
