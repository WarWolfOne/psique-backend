package br.com.psique.main.usuario.profissional.psicologos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class PsicologoService{
    @Autowired //Permite que trabalhe com outros arquivos, um dentro do outro (injeção de Dependencias)
    private PsicologoRepository psicologoRepository;

    public List<Psicologo> findAll() {
        return psicologoRepository.findAll();
    }

    public  Psicologo save(Psicologo psicologo, Errors errors) {
        return psicologoRepository.save(psicologo);
    }

    public Psicologo findById(long id) {
        return psicologoRepository.findById(id).get();
    }

    void deleteById(long id) {
        psicologoRepository.deleteById(id);
    }
}
