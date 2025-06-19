/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Animal {
    private String id;
    private String nombre;
    private String especie;
    private LocalDate FechaNacimiento;
    private Zona ZonaActual;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public Zona getZonaActual() {
        return ZonaActual;
    }

    public void setZonaActual(Zona ZonaActual) {
        this.ZonaActual = ZonaActual;
    }
    
    
    
    public Animal(String id, String nombre, String especie, LocalDate FechaNacimiento) {
        if (!id.matches("[A-Z]-\\d{4}")) {
            this.id = id;}
        this.nombre = nombre;
        this.especie = especie;
        if(FechaNacimiento.isAfter(LocalDate.now())){
        this.FechaNacimiento = FechaNacimiento;}
        this.ZonaActual = Zona.CONSERVACIONYRESCATE;
    }
}
