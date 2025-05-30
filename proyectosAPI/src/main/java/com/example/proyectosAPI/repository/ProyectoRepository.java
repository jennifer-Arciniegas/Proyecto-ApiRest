package com.example.proyectosAPI.repository;

import com.example.proyectosAPI.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}
