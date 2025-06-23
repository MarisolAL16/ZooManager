/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Utils.UtilDate;
import java.time.LocalDate;
/**
 *
 * @author Jonathan
 */
public abstract class Persona {
    
protected String cedula;
protected String nombre_completo;
protected LocalDate fechaNacimiento;
protected String telefono;

    public String getCedula() {
        return cedula;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}"))
        this.telefono = telefono;
    }
    
        public int getEdad() {
        return UtilDate.calcularEdad(fechaNacimiento);
    }
    
    public Persona(String cedula, String nombre_completo, LocalDate fechaNacimiento, String telefono) {
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        this.fechaNacimiento = fechaNacimiento;
        if(telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
        this.telefono = telefono;}
    }
    public Persona(String cedula, String nombre_completo, LocalDate fechaNacimiento) {
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        if (!UtilDate.validarFechaFutura(fechaNacimiento)){
        this.fechaNacimiento = fechaNacimiento;}
        this.telefono = null;
    }

    @Override
    public String toString() {
        return "Persona: " + "Cedula: " + cedula + ", Nombre Completo: " + nombre_completo + ", Fecha Nacimiento: " + fechaNacimiento + ", Telefono: " + telefono;
    } 
}