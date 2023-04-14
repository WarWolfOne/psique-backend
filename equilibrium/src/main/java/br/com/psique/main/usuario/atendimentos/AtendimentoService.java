package br.com.psique.main.usuario.atendimentos;

//Regras de negocio.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class AtendimentoService {

    @Autowired //Permite que trabalhe com outros arquivos, um dentro do outro (injeção de Dependencias)
    private AtendimentoRepository atendimentoRepository;

    public List<Atendimento> findAll() {
        return atendimentoRepository.findAll();
    }

    public Atendimento save(Atendimento atendimento, Errors errors) {
        return atendimentoRepository.save(atendimento);
    }

    public Atendimento findById(long id) {
        return atendimentoRepository.findById(id).get();
    }

    void deleteById(long id) {
        atendimentoRepository.deleteById(id);
    }
}
