package com.example.proyectosAPI.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreTarea;
    private String descripcion;
    private String prioridad;
    private String estado;
    private Date fechaVencimiento;
    @ManyToOne
    @JoinColumn(name = "Usuario_asignado_id")
    private Usuario usuarioAsignado;

    public Tarea() {
    }

    public Tarea(long id, Usuario usuarioAsignado, Date fechaVencimiento, String prioridad, String descripcion, String nombreTarea, String estado) {
        this.id = id;
        this.usuarioAsignado = usuarioAsignado;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.nombreTarea = nombreTarea;
        this.estado = estado;
    }

    public void setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
