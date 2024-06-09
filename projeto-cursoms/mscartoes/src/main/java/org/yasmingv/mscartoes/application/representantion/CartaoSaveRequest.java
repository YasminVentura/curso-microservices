package org.yasmingv.mscartoes.application.representantion;

import lombok.Data;
import org.yasmingv.mscartoes.domain.BandeiraCartao;
import org.yasmingv.mscartoes.domain.Cartao;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel(){
        return new Cartao(nome, bandeira, renda, limite );
    }
}