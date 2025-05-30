package com.example.proyectosAPI.repository;

import com.example.proyectosAPI.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByEstado(String estado);

    List<Tarea> findByPrioridad(String prioridad);

    List<Tarea> findByEstadoOrderByFechaVencimientoAsc(String estado);

    @Query("SELECT t FROM Tarea t WHERE " +
            "(:estado IS NULL OR t.estado = :estado) AND " +
            "(:prioridad IS NULL OR t.prioridad = :prioridad)")
    List<Tarea> filtrarTareas(
            @Param("estado") String estado,
            @Param("prioridad") String prioridad
    );
}
