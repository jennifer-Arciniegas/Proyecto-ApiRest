package com.example.proyectosAPI.service;

import com.example.proyectosAPI.model.Proyecto;
import com.example.proyectosAPI.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepository projectRepository;

    public List<Proyecto>  getAllProyectos(){
        return projectRepository.findAll();
    }

    public Proyecto getProyectoById(Long id){
        return projectRepository.findById(id).orElse(null);
    }
    public Proyecto createProyecto(Proyecto proyecto){
        return projectRepository.save(proyecto);
    }
    public Proyecto updateProyecto (Long id, Proyecto proyecto){
        proyecto.setId(id);
        return projectRepository.save(proyecto);
    }
    public void deleteProyecto(Long id){
        projectRepository.findById(id);
    }

}
