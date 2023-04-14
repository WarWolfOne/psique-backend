package br.com.psique.main.usuario.profissional.psicologos;

import br.com.psique.core.controller.ResponseAbtractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/psicologos")
public class PsicologoController extends ResponseAbtractController{

    @Autowired
    private PsicologoService psicologoService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return jsonResponse(psicologoService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return jsonResponse(psicologoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Psicologo psicologo, Errors errors) {
        return jsonResponse(psicologoService.save(psicologo, errors));
    }

    @PutMapping
    public ResponseEntity<?> update(@Validated @RequestBody Psicologo psicologo, Errors errors) {
        return jsonResponse(psicologoService.save(psicologo, errors));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleById(@PathVariable long id) {
        psicologoService.deleteById(id);
        return jsonResponse();
    }
}
