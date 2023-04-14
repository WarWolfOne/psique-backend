package br.com.psique.main.usuario.paciente;

//Consultas comecam pelo Repositorio.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    //Jpa tras funções pré-programadas como busca, exclusoes etc.

}
