package org.yasmingv.mscartoes.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yasmingv.mscartoes.domain.ClienteCartao;

import java.util.List;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long> {
    List<ClienteCartao> findByCpf(String cpf);
}