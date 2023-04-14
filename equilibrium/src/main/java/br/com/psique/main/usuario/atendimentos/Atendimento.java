package br.com.psique.main.usuario.atendimentos;

import br.com.psique.main.usuario.profissional.psicologos.Psicologo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "atendimentos")
@Getter
@Setter

public class Atendimento implements Serializable{ //Entender como o arquivo trata os dados

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private br.com.psique.main.usuario.paciente.Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "psicologo_id")
    private Psicologo psicologo;

    @Column(name = "observacoes")
    private String observacoes;

    @Column(name = "recomendacoes")
    private String recomendacoes;

    @Column(name = "agendamentoData")
    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date agendamentoData;

    @Column(name = "agendamentoHora")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date agendamentoHora;

    @Column(name = "status")
    private String status;
}