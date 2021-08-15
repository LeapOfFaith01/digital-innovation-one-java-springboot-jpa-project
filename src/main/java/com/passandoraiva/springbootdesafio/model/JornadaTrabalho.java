package com.passandoraiva.springbootdesafio.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
//Cria um builder que eu ainda não sei o proposito
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Data gera os construtores comuns
@Entity
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
}
