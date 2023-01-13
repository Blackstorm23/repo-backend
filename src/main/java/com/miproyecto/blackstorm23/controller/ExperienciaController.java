package com.miproyecto.blackstorm23.controller;

import com.miproyecto.blackstorm23.entity.Experiencia;
import com.miproyecto.blackstorm23.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia") //localhost:8080/experiencia
@CrossOrigin(origins = {"https://porfolio-black-5401c.web.app"})
public class ExperienciaController {
    
    @Autowired
    ExperienciaService expServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Experiencia> lista(){
        return expServ.lista();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Experiencia buscar(@PathVariable int id){
        return expServ.buscar(id);
    }
    
    @PostMapping("/crear")
    public void crear(@RequestBody Experiencia exp){
        expServ.crear(exp);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable ("id") int id){
        expServ.borrar(id);
    }
    
    @PutMapping("/edit")
    public void edit(@RequestBody Experiencia exp){
        expServ.edit(exp);
    }  
    
}
