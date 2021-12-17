package com.informatorio.tpfinal.repository;

import com.informatorio.tpfinal.entity.Emprendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {
}
