package com.exemplo.apipersistencia.repository;

import com.exemplo.apipersistencia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
