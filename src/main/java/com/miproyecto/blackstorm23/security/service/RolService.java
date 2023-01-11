package com.miproyecto.blackstorm23.security.service;

import com.miproyecto.blackstorm23.security.entity.Rol;
import com.miproyecto.blackstorm23.security.enums.RolNombre;
import com.miproyecto.blackstorm23.security.repository.RolRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getbyRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}
