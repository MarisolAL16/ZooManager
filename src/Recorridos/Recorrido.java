/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recorridos;

import Empleados.Guia;
import Personas.Visitante;
import Animals.Animal;
import java.time.LocalDate;
/**
 *
 * @author Jonathan
 */
public class Recorrido {
    private Guia guia;
    private LocalDate fechaRecorrido;
    private String[] visitantes;
    private String[] animalesVistos;

    public Guia getGuia() {
        return guia;
    }
    public LocalDate getFechaRecorrido() {
        return fechaRecorrido;
    }
    public String[] getVisitantes() {
        return visitantes;
    }
    public String[] getAnimalesVistos() {
        return animalesVistos;
    }
    
    public void añadirAnimalVisto(Animal animal) {
        int max = animalesVistos.length;
        for (int i = 0; i < max; i++) {
            if(animalesVistos[i ]== null){
            animalesVistos[i] = animal.toString();
            break;
         }
        }
    }
    public void añadirVisitante(Visitante visitante) {
        int max = visitantes.length;
        for (int i = 0; i < max; i++) {
            if(visitantes[i ]== null){
            visitantes[i] = visitante.getNombre_completo();
            break;
         }
        }
    }
    
   public String mostrarVisitantes() {
        int max = visitantes.length;
        String texto = "";
        for (int i = 0; i < max; i++) {
            if (visitantes[i] != null) {
                texto +=  "- " + visitantes[i] + "\n";
            }
        }
         return texto;
    }
   public String mostrarAnimalesVistos() {
        int max = animalesVistos.length;
        String texto = "";
        for (int i = 0; i < max; i++) {
            if (animalesVistos[i] != null) {
                texto +=  "- " + animalesVistos[i] + "\n";
            }
        }
         return texto;
    }
   
    public Recorrido(Guia guia, String[] visitantes) {
        this.guia = guia;
        this.fechaRecorrido = LocalDate.now();
        if (visitantes.length <= 10) {
        this.visitantes = new String [100];}
        this.animalesVistos = new String [100];
    }

    @Override
    public String toString() {
        return "Recorrido: " + "Guia: " + guia.getNombre_completo() + ", Fecha Recorrido: " + fechaRecorrido + ", Visitantes: " + mostrarVisitantes() + ", Animales vistos: " + mostrarAnimalesVistos() ;
    }
}
