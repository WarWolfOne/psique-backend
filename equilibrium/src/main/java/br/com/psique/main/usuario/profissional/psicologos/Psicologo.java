package br.com.psique.main.usuario.profissional.psicologos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "psicologo")
@Getter
@Setter

public class Psicologo{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(
            name = "nome",
            nullable = false,
            length = 80
    )
    private String nome;

    @Column(
            name = "nomeSocial",
            length = 80
    )
    private String nomeSocial;

    @Column(
            name = "CRP",
            nullable = false,
            length = 6
    )
    private String CRP;

    @Column(
            name = "estadoEmissor",
            nullable = false,
            length = 2
    )
    private String estadoEmissor;

    @Column(
            name = "eMail",
            nullable = false,
            length = 80
    )
    private String eMail;

    @Column(
            name = "telefone",
            nullable = false,
            length = 11
    )
    private String telefone;

    @Column(
            name = "descricao",
            length = 1024
    )
    private String descricao;

    @Column(
            name = "especialidade",
            nullable = false,
            length = 80
    )
    private String especialidade;

    @Column(
            name = "especialidade2",
            length = 80
    )
    private String especialidade2;

    @Column(
            name = "especialidade3",
            length = 80
    )
    private String especialidade3;


    @Column(
            name = "valorHora",
            nullable = false
    )
    private Double valorHora;

    @Column(name = "segunda")
    private Integer segunda;

    @Column(name = "horarioAtendimentoSegunda")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoSegunda;

    @Column(name = "horarioEncerramentoSegunda")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoSegunda;

    @Column(name = "terca")
    private Integer terca;

    @Column(name = "horarioAtendimentoTerca")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoTerca;

    @Column(name = "horarioEncerramentoTerca")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoTerca;

    @Column(name = "quarta")
    private Integer quarta;

    @Column(name = "horarioAtendimentoQuarta")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoQuarta;

    @Column(name = "horarioEncerramentoQuarta")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoQuarta;

    @Column(name = "quinta")
    private Integer quinta;

    @Column(name = "horarioAtendimentoQuinta")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoQuinta;

    @Column(name = "horarioEncerramentoQuinta")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoQuinta;

    @Column(name = "sexta")
    private Integer sexta;

    @Column(name = "horarioAtendimentoSexta")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoSexta;

    @Column(name = "horarioEncerramentoSexta")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoSexta;

    @Column(name = "sabado")
    private Integer sabado;

    @Column(name = "horarioAtendimentoSabado")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoSabado;

    @Column(name = "horarioEncerramentoSabado")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoSabado;

    @Column(name = "domingo")
    private Integer domingo;

    @Column(name = "horarioAtendimentoDomingo")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioAtendimentoDomingo;

    @Column(name = "horarioEncerramentoDomingo")
    @JsonFormat(pattern = "HH:mm")
    @DateTimeFormat(pattern = "HH:mm")
    private Date horarioEncerramentoDomingo;

}
