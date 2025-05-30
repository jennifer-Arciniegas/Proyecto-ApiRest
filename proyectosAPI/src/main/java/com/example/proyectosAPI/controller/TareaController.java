package com.example.proyectosAPI.controller;

import com.example.proyectosAPI.model.Tarea;
import com.example.proyectosAPI.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin (origins = "*")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaService.getAllTareas();
    }
    @GetMapping("/{id}")
    public Tarea getTarea(@PathVariable Long id){
        return tareaService.getTareaById(id);
    }
    @PostMapping
    public Tarea createTarea (@RequestBody Tarea tarea){
        return tareaService.createTarea(tarea);
    }
    @PutMapping("/{id}")
    public Tarea updateTarea(@PathVariable Long id, @RequestBody Tarea tarea){
        return tareaService.updateTarea(id,tarea);
    }
    @DeleteMapping("/{id}")
    public void deleteTarea(@PathVariable Long id){
        tareaService.deleteTarea(id);

    }
    @GetMapping("/filtro")
    public List<Tarea> filtrarTareas(
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) String prioridad
    ) {
        return tareaService.filtrarTareas(estado, prioridad);
    }
}
