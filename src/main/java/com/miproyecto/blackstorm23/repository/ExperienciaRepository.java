package com.miproyecto.blackstorm23.repository;

import com.miproyecto.blackstorm23.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer>{
    
}
