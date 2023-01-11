package com.miproyecto.blackstorm23.service;

import com.miproyecto.blackstorm23.entity.Experiencia;
import com.miproyecto.blackstorm23.repository.ExperienciaRepository;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    public ExperienciaRepository expRepo;
    
    public List<Experiencia> lista(){
      List<Experiencia> listaExperiencia= expRepo.findAll();
      return listaExperiencia;
    }
    
    public Experiencia buscar(int id){
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
    
    public void crear(Experiencia expe){
        expRepo.save(expe);
    }
    
     public void edit(Experiencia expe){
        expRepo.save(expe);
    }
    
    public void borrar(int id){
        expRepo.deleteById(id);
    }
    
}
