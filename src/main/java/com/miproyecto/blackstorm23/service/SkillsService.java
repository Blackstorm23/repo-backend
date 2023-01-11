package com.miproyecto.blackstorm23.service;

import com.miproyecto.blackstorm23.entity.Skills;
import com.miproyecto.blackstorm23.repository.SkillsRepository;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {
    @Autowired
    public SkillsRepository skiRepo;
    
    public List<Skills> ver(){
      List<Skills> listaSkills= skiRepo.findAll();
      return listaSkills;
    }
    
    public Skills buscar(int id){
        Skills ski = skiRepo.findById(id).orElse(null);
        return ski;
    }
    
    public void crear(Skills skil){
        skiRepo.save(skil);
    }
    
     public void edit(Skills skil){
        skiRepo.save(skil);
    }
    
    public void borrar(int id){
        skiRepo.deleteById(id);
    }
}
