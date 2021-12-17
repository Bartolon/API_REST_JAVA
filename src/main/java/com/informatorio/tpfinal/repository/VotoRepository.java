package com.informatorio.tpfinal.repository;

import java.util.List;
import com.informatorio.tpfinal.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {
    List<Voto> findByUsuarioId(Long usuarioId);
}
