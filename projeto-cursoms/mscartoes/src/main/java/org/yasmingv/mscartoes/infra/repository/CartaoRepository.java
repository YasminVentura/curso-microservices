package org.yasmingv.mscartoes.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yasmingv.mscartoes.domain.Cartao;

import java.math.BigDecimal;
import java.util.List;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    List<Cartao> findByRendaLessThanEqual(BigDecimal renda);

}
