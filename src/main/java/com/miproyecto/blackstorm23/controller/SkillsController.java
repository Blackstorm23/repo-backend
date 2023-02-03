package com.miproyecto.blackstorm23.controller;

import com.miproyecto.blackstorm23.entity.Skills;
import com.miproyecto.blackstorm23.service.SkillsService;
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
@RequestMapping("/skills") //localhost:8080/persona
@CrossOrigin(origins = {"https://porfolio-black-storm.web.app","http://localhost:4200"})
public class SkillsController {
    
    @Autowired
    SkillsService skiServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Skills> ver(){
        return skiServ.ver();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Skills buscar(@PathVariable int id){
        return skiServ.buscar(id);
    }
    
    @PostMapping("/crear")
    public void crear(@RequestBody Skills ski){
        skiServ.crear(ski);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable int id){
        skiServ.borrar(id);
    }
    
    @PutMapping("/edit")
    public void edit(@RequestBody Skills ski){
        skiServ.edit(ski);
    }
    
}
