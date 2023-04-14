package br.com.psique.main.usuario.profissional.psiquiatras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class PsiquiatraService{
    @Autowired //Permite que trabalhe com outros arquivos, um dentro do outro (injeção de Dependencias)
    private PsiquiatraRepository psiquiatraRepository;

    public List<Psiquiatra> findAll(){
        return psiquiatraRepository.findAll();
    }

    public  Psiquiatra save(Psiquiatra psiquiatra, Errors errors){
        return psiquiatraRepository.save(psiquiatra);
    }

    public Psiquiatra findById(long id){
        return psiquiatraRepository.findById(id).get();
    }

    void deleteById(long id){
        psiquiatraRepository.deleteById(id);
    }
}
