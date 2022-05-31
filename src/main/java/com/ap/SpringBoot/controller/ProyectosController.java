package com.ap.SpringBoot.controller;

import com.ap.SpringBoot.models.Proyectos;
import com.ap.SpringBoot.services.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")

public class ProyectosController {
   private ProyectosService proyectosService;

    @Autowired
    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @PostMapping("/save")
    public Proyectos newProyectos(@RequestBody Proyectos proyectos){
        return proyectosService.addProyectos(proyectos);
    }

    @GetMapping("/findAll")
    public List<Proyectos> findAllProyectos(){
        return proyectosService.buscarProyectos();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProyectos(@PathVariable Long id){
        proyectosService.borrarProyectos(id);
    }

    @PutMapping("/edit")
    public Proyectos editProyectos(@RequestBody Proyectos proyectos){
        return proyectosService.addProyectos(proyectos);
    }
}
