/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Jonathan
 */
public abstract class UtilDate {
    public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            return -1;}
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static boolean validarFechaFutura(LocalDate fecha) {
        return !fecha.isAfter(LocalDate.now());
    }

    public static boolean validarMayorEdad(LocalDate fechaNacimiento) {
        return calcularEdad(fechaNacimiento) >= 18;
    }
}