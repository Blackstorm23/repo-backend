package com.miproyecto.blackstorm23.repository;

import com.miproyecto.blackstorm23.entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios, Integer> {
    
}
