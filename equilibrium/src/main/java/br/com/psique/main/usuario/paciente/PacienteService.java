package br.com.psique.main.usuario.paciente;

//Regras de negocio.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class PacienteService{

    @Autowired //Permite que trabalhe com outros arquivos, um dentro do outro (injeção de Dependencias)
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public  Paciente save(Paciente paciente, Errors errors) {
        return pacienteRepository.save(paciente);
    }

    public Paciente findById(long id) {
        return pacienteRepository.findById(id).get();
    }

    void deleteById(long id) {
        pacienteRepository.deleteById(id);
    }
}
