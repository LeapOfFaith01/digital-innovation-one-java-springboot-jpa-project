package com.passandoraiva.springbootdesafio.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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

/**
 * Implementação da solução de uma chave COMPOSTA
 * */
@Entity
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;

}
