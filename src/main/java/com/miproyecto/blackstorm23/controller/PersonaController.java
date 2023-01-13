package com.miproyecto.blackstorm23.controller;

import com.miproyecto.blackstorm23.entity.Persona;
import com.miproyecto.blackstorm23.service.PersonaService;
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
@RequestMapping("/persona") //localhost:8080/persona
@CrossOrigin(origins = {"https://porfolio-black-5401c.web.app"})
public class PersonaController {
    
    @Autowired
    PersonaService persoServ;
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Persona> ver(){
        return persoServ.ver();
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    public Persona buscar(@PathVariable int id){
        return persoServ.buscar(id);
    }
    
    @PostMapping("/crear")
    public void crear(@RequestBody Persona per){
        persoServ.crear(per);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable int id){
        persoServ.borrar(id);
    }
    
    @PutMapping("/edit")
    public void edit(@RequestBody Persona per){
        persoServ.edit(per);
    }
}
