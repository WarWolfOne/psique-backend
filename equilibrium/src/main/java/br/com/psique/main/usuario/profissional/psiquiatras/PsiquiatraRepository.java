package br.com.psique.main.usuario.profissional.psiquiatras;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsiquiatraRepository  extends JpaRepository<Psiquiatra, Long>{
        //Jpa tras funções pré-programadas como busca, exclusoes etc.
}
