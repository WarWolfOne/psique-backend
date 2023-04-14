package br.com.psique.main.usuario.atendimentos;

//Controle de acesso.

import br.com.psique.core.controller.ResponseAbtractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController extends ResponseAbtractController{

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return jsonResponse(atendimentoService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return jsonResponse(atendimentoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Atendimento atendimento, Errors errors) {
        return jsonResponse(atendimentoService.save(atendimento, errors));
    }

    @PutMapping
    public ResponseEntity<?> update(@Validated @RequestBody Atendimento atendimento, Errors errors) {
        return jsonResponse(atendimentoService.save(atendimento, errors));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleById(@PathVariable long id) {
        atendimentoService.deleteById(id);
        return jsonResponse();
    }
}
