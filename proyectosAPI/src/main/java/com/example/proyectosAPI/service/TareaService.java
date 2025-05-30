package com.example.proyectosAPI.service;

import com.example.proyectosAPI.model.Tarea;
import com.example.proyectosAPI.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    @Autowired

    private TareaRepository tareaRepository;

    public List<Tarea> getAllTareas(){
        return tareaRepository.findAll();
    }
    public Tarea getTareaById(Long id){
        return tareaRepository.findById(id).orElse(null);
    }
    public Tarea createTarea(Tarea tarea){
        return tareaRepository.save(tarea);
    }
    public Tarea updateTarea(Long id, Tarea tarea){
        tarea.setId(id);
        return tareaRepository.save(tarea);
    }
    public void deleteTarea(Long id){
        tareaRepository.deleteById(id);
    }
    public List<Tarea> filtrarTareas(String estado, String prioridad) {
        return tareaRepository.filtrarTareas(estado, prioridad);
    }
}
