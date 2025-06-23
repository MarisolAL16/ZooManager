/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;
/**
 *
 * @author Jonathan
 */
public class Visitante extends Persona {
   

    public Visitante(String cedula, String nombre_completo, LocalDate fechaNacimiento, String telefono) {
        super(cedula, nombre_completo, fechaNacimiento, telefono);
    }

    public Visitante(String cedula, String nombre_completo, LocalDate fechaNacimiento) {
        super(cedula, nombre_completo, fechaNacimiento);
    }   
}
