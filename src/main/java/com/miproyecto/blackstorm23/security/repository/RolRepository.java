package com.miproyecto.blackstorm23.security.repository;

import com.miproyecto.blackstorm23.security.entity.Rol;
import com.miproyecto.blackstorm23.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
