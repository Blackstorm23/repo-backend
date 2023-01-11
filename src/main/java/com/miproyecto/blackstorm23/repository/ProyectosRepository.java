package com.miproyecto.blackstorm23.repository;

import com.miproyecto.blackstorm23.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Integer>{
    
}
