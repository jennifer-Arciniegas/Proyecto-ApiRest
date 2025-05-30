package com.example.proyectosAPI.controller;

import com.example.proyectosAPI.model.Proyecto;
import com.example.proyectosAPI.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
@CrossOrigin(origins = "*")
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    @GetMapping
    public List<Proyecto> getAllProyecto(){
        return proyectoService.getAllProyectos();
    }
    @GetMapping("/{id}")
    public Proyecto getProyecto (@PathVariable Long id){
        return proyectoService.getProyectoById(id);
    }
    @PostMapping
    public Proyecto createProyecto(@RequestBody Proyecto proyecto){
        return proyectoService.createProyecto(proyecto);
    }
    @PutMapping("/{id}")
    public Proyecto updateProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto){
        return proyectoService.updateProyecto(id, proyecto);
    }
    @DeleteMapping("/{id}")
    public void  deleteProyecto(@PathVariable Long id){
        proyectoService.deleteProyecto(id);
    }

}
