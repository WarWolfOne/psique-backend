package br.com.psique.main.usuario.atendimentos;

//Consultas comecam pelo Repositorio.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long>{
    //Jpa tras funções pré-programadas como busca, exclusoes etc.

}
