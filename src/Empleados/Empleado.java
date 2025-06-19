/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Jonathan
 */
public abstract class Empleado {
    private String cedula;
    private String NombreCompleto;
    private LocalDate FechaNacimiento;
    private String telefono;
    private double SalarioMensual;

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSalarioMensual() {
        return SalarioMensual;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSalarioMensual(double SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }
    
    public boolean validarFecha(LocalDate FechaNacimiento){
     LocalDate hoy = LocalDate.now();
     Period age = Period.between(FechaNacimiento, hoy);
     return !FechaNacimiento.isAfter(hoy)&& age.getYears()>= 18;
    }    
    
    public Empleado(String cedula, String NombreCompleto, LocalDate FechaNacimiento, String telefono, double SalarioMensual) {
        this.cedula = cedula;
        this.NombreCompleto = NombreCompleto;
        if (validarFecha(FechaNacimiento)){
        this.FechaNacimiento = FechaNacimiento;}
        if(telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
        this.telefono = telefono;}
        if(SalarioMensual >= 300000){
        this.SalarioMensual = SalarioMensual;}
    }
}