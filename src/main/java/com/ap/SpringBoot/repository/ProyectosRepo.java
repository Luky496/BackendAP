package com.ap.SpringBoot.repository;

import com.ap.SpringBoot.models.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProyectosRepo extends JpaRepository<Proyectos,Long> {
}
