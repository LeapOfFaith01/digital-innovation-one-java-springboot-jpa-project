package com.passandoraiva.springbootdesafio.repository;

import com.passandoraiva.springbootdesafio.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
