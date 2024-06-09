package org.yasmingv.mscartoes.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.yasmingv.mscartoes.domain.ClienteCartao;
import org.yasmingv.mscartoes.infra.repository.ClienteCartaoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}