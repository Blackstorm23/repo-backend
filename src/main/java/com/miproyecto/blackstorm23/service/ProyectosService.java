package com.miproyecto.blackstorm23.service;

import com.miproyecto.blackstorm23.entity.Proyectos;
import com.miproyecto.blackstorm23.repository.ProyectosRepository;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    
    @Autowired
    public ProyectosRepository proRepo;
    
    public List<Proyectos> ver(){
      List<Proyectos> listaProyectos= proRepo.findAll();
      return listaProyectos;
    }
    
    public Proyectos buscar(int id){
        Proyectos est = proRepo.findById(id).orElse(null);
        return est;
    }
    
    public void crear(Proyectos pro){
        proRepo.save(pro);
    }
    
     public void edit(Proyectos pro){
        proRepo.save(pro);
    }
    
    public void borrar(int id){
        proRepo.deleteById(id);
    }
    
}
