package com.miproyecto.blackstorm23.controller;

import com.miproyecto.blackstorm23.entity.Proyectos;
import com.miproyecto.blackstorm23.service.ProyectosService;
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
@RequestMapping("proyectos") //localhost:8080/persona
@CrossOrigin(origins = {"https://porfolio-black-5401c.web.app"})
public class ProyectosController {
    
    @Autowired
    ProyectosService proServ;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Proyectos> ver(){
        return proServ.ver();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Proyectos buscar(@PathVariable int id){
        return proServ.buscar(id);
    }
    
    @PostMapping("/crear")
    public String crear(@RequestBody Proyectos proy){
        proServ.crear(proy);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable int id){
        proServ.borrar(id);
    }
    
    @PutMapping("/edit")
    public void edit(@RequestBody Proyectos proy){
        proServ.edit(proy);
    }
    
}
