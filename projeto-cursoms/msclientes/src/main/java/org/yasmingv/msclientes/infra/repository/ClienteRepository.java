package org.yasmingv.msclientes.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yasmingv.msclientes.domain.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf(String cpf);
}