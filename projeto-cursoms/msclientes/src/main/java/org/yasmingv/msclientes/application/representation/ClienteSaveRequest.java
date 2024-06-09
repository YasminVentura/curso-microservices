package org.yasmingv.msclientes.application.representation;

import lombok.Data;
import org.yasmingv.msclientes.domain.Cliente;

@Data
public class ClienteSaveRequest {
    private String cpf;
    private String nome;
    private Integer idade;


    public Cliente toModel(){
        return new Cliente(cpf, nome, idade);
    }
}