/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Cuidador extends Empleado{
    private String especialidad;
    private String[] ActividadRealizada;
    
    
    public void alimentarAnimal(String animal) {
        String actividad = "Alimento al animal: " + animal;
    }
    
    public void revisarSaludAnimal(String animal) {
        String actividad = "Verifico salud del animal: " + animal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String[] getActividadRealizada() {
        return ActividadRealizada;
    }
    
    
    public Cuidador(String especialidad, String[] ActividadRealizada, String cedula, String NombreCompleto, LocalDate FechaNacimiento, String telefono, double SalarioMensual) {
        super(cedula, NombreCompleto, FechaNacimiento, telefono, SalarioMensual);
        this.especialidad = especialidad;
        this.ActividadRealizada = new String[50];
    }

    public void mostrarActividades() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void registrarActividad(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
