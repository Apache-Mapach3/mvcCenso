package com.jarry.proyecto.repositorio;

import com.jarry.proyecto.modelo.Censo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CensoRepository extends JpaRepository<Censo, Long> {
}