package com.miproyecto.blackstorm23.service;

import com.miproyecto.blackstorm23.entity.Estudios;
import com.miproyecto.blackstorm23.repository.EstudiosRepository;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EstudiosService{
    
    @Autowired
    public EstudiosRepository estRepo;
    
    public List<Estudios> ver(){
      List<Estudios> listaEstudios= estRepo.findAll();
      return listaEstudios;
    }
    
    public Estudios buscar(int id){
        Estudios est = estRepo.findById(id).orElse(null);
        return est;
    }
    
    public void crear(Estudios est){
        estRepo.save(est);
    }
    
     public void edit(Estudios est){
        estRepo.save(est);
    }
    
    public void borrar(int id){
        estRepo.deleteById(id);
    }
    
}
