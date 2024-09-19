package com.cita.oladent.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // Generación automática del ID
    private Long id;

    @Column(nullable = false)  // El nombre del paciente no puede ser nulo
    private String nombrePaciente;

    @Column(nullable = false)  // La fecha de la cita no puede ser nula
    private String fecha;

    @Column(nullable = false)  // La hora de la cita no puede ser nula
    private String hora;

    @Column(nullable = false)  // La descripción de la cita no puede ser nula
    private String descripcion;

    @ColumnDefault("'Pendiente'")  // Estado de la cita por defecto
    private String estado = "Pendiente";  // Nueva columna para el estado de la cita

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
