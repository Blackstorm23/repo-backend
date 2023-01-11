package com.miproyecto.blackstorm23.repository;

import com.miproyecto.blackstorm23.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Integer>{
    
}
