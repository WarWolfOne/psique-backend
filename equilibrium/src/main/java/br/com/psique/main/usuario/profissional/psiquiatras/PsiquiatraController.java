package br.com.psique.main.usuario.profissional.psiquiatras;

import br.com.psique.core.controller.ResponseAbtractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/psiquiatras")
public class PsiquiatraController extends ResponseAbtractController{

    @Autowired
    private PsiquiatraService psiquiatraService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return jsonResponse(psiquiatraService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        return jsonResponse(psiquiatraService.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Psiquiatra psiquiatra, Errors errors){
        return jsonResponse(psiquiatraService.save(psiquiatra, errors));
    }

    @PutMapping
    public ResponseEntity<?> update(@Validated @RequestBody Psiquiatra psiquiatra, Errors errors){
        return jsonResponse(psiquiatraService.save(psiquiatra, errors));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleById(@PathVariable long id){
        psiquiatraService.deleteById(id);
        return jsonResponse();
    }
}
