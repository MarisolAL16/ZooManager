/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitas;

import Personas.Visitante;
import java.time.LocalDate;
/**
 *
 * @author Jonathan
 */
public class Visita {
    private Visitante visitante;
    private LocalDate fechaIngreso;

    public Visitante getVisitante() {
        return visitante;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public Visita(Visitante visitante, LocalDate fechaIngreso) {
        this.visitante = visitante;
        this.fechaIngreso = LocalDate.now();
    }
    
    @Override
    public String toString() {
        return "Visita hecha por: " + "Visitante: " + visitante.toString() + ", Fecha Ingreso: " + fechaIngreso.toString();
    }
    
 }


