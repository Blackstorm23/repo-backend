package com.miproyecto.blackstorm23.service;

import com.miproyecto.blackstorm23.entity.Persona;
import com.miproyecto.blackstorm23.repository.PersonaRepository;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;
    
    public List<Persona> ver(){
      List<Persona> listaPersonas= persoRepo.findAll();
      return listaPersonas;
    }
    
    public Persona buscar(int id){
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    public void crear(Persona perso){
        persoRepo.save(perso);
    }
    
     public void edit(Persona perso){
        persoRepo.save(perso);
    }
    
    public void borrar(int id){
        persoRepo.deleteById(id);
    }
    
}
