package br.com.psique.main.usuario.paciente;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pacientes")
@Getter
@Setter

public class Paciente implements Serializable{ //Entender como o arquivo trata os dados

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    //@OneToMany(mappedBy = "paciente")
    //private List<Consulta> consultaList;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nomeSocial")
    private String nomeSocial;

    @Column(name = "eMail", unique = true) //unique = true garante que não haja outro eMail igual no banco de dados.
    private String eMail;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "perfilPsicologico")
    private String perfilPsicologico;

}