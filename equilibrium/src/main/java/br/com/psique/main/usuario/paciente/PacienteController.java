package br.com.psique.main.usuario.paciente;

//Controle de acesso.

import br.com.psique.core.controller.ResponseAbtractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController extends ResponseAbtractController{

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return jsonResponse(pacienteService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return jsonResponse(pacienteService.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Paciente paciente, Errors errors) {
        return jsonResponse(pacienteService.save(paciente, errors));
    }

    @PutMapping
    public ResponseEntity<?> update(@Validated @RequestBody Paciente paciente, Errors errors) {
        return jsonResponse(pacienteService.save(paciente, errors));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleById(@PathVariable long id) {
        pacienteService.deleteById(id);
        return jsonResponse();
    }
}
