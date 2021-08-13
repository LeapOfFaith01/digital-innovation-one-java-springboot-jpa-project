package com.passandoraiva.springbootdesafio.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

//Cria os Getters dos valores
@Getter
//Cria os Setters dos valores
@Setter
//Cria construtores para todos os atributos
@AllArgsConstructor
//Cria construtor vazio
@NoArgsConstructor
//Cria o override equals
@EqualsAndHashCode
//Cria um builder que eu ainda não sei o proposito
@Builder
//@Data gera os construtores comuns
@Entity
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;
}
