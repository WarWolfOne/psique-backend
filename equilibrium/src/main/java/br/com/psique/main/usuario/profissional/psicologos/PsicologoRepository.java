package br.com.psique.main.usuario.profissional.psicologos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsicologoRepository extends JpaRepository<Psicologo, Long>{
    //Jpa tras funções pré-programadas como busca, exclusoes etc.
}
