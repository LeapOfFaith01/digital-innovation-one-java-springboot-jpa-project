package com.passandoraiva.springbootdesafio.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;


}
