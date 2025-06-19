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
public class Guia extends Empleado {
    private String[] idiomas;
    
    private String[] recorridos;

    public String[] getIdiomas() {
        return idiomas;
    }

    public String[] getRecorridos() {
        return recorridos;
    }
    
    
    
    

    public Guia(String[] idiomas, String[] recorridos, String cedula, String NombreCompleto, LocalDate FechaNacimiento, String telefono, double SalarioMensual) {
        super(cedula, NombreCompleto, FechaNacimiento, telefono, SalarioMensual);
        this.idiomas = idiomas;
        this.recorridos = recorridos;
    }

}
