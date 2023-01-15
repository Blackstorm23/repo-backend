package com.miproyecto.blackstorm23.controller;

import com.miproyecto.blackstorm23.entity.Estudios;
import com.miproyecto.blackstorm23.service.EstudiosService;
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
@RequestMapping("/estudios") //localhost:8080/persona
@CrossOrigin(origins = {"https://porfolio-black-storm.web.app"})
public class EstudiosController {
   
    @Autowired
    EstudiosService estServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Estudios> ver(){
        return estServ.ver();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Estudios buscar(@PathVariable int id){
        return estServ.buscar(id);
    }
    
    @PostMapping("/crear")
    public void crear(@RequestBody Estudios estu){
        estServ.crear(estu);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable int id){
        estServ.borrar(id);
    }
    
    @PutMapping("/edit")
    public void edit(@RequestBody Estudios estu){
        estServ.edit(estu);
    }  
}
