/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Empleados.Cuidador;
import Empleados.Empleado;
import Empleados.Guia;

/**
 *
 * @author Jonathan
 */
public class Zoo {
import Animals.Animal;
import Empleados.Cuidador;
import Empleados.Empleado;
import Empleados.Guia;
import Recorridos.Recorrido;
import Visitas.Visita;

public class Zoologico {
    private Animal[] animales;
    private Empleado[] empleados;
    private Visita[] visitas;
    private Recorrido[] recorridos;
 
    public Zoologico() {
        animales = new Animal [100];
        empleados = new Empleado [100];
        visitas = new Visita [100];
        recorridos = new Recorrido [100];
    }

    // Animales
    public void agregarAnimal(Animal animal) {
         for (int i = 0; i < animales.length; i++) {
                 if (animales[i] == null) {
                  animales[i] = animal;
                  break;
                  }
         }
    }

    public Animal buscarAnimalPorNombre(String nombre) {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a.toString());
        }
    }

    public void agregarEmpleado(Empleado e) {
         for (int i = 0; i < empleados.length; i++) {
                 if (empleados[i] == null) {
                  empleados[i] = e;
                  break;
                  }
         }
    }

    public Empleado buscarEmpleadoPorCedula(String cedula) {
        for (Empleado e : empleados) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    public void registrarActividad(String cedula, String descripcion) {
        Empleado e = buscarEmpleadoPorCedula(cedula);
        if (e instanceof Cuidador) {
            ((Cuidador) e).registrarActividad(descripcion);
        }
    }
    public void registrarRecorrido(String cedula, Recorrido r) {
        Empleado e = buscarEmpleadoPorCedula(cedula);
        if (e instanceof Guia) {
            ((Guia) e).añadirRecorridoRealizado(r);
         for (int i = 0; i < recorridos.length; i++) {
                 if (recorridos[i] == null) {
                  recorridos[i] = r;
                  break;
                  }
         }
        }
    }

    public void registrarVisita(Visita v) {
         for (int i = 0; i < visitas.length; i++) {
                 if (visitas[i] == null) {
                  visitas[i] = v;
                  break;
                  }
         }
    }

    public void mostrarRecorridosPorGuia(String cedula) {
        Empleado e = buscarEmpleadoPorCedula(cedula);
        if (e instanceof Guia) {
            ((Guia) e).mostrarReccoridos();
        }
    }

    public void mostrarActividadesPorCuidador(String cedula) {
        Empleado e = buscarEmpleadoPorCedula(cedula);
        if (e instanceof Cuidador) {
            ((Cuidador) e).mostrarActividades();
        }
    }
    
    public void mostrarAnimalesDeRecorrido(Recorrido idRecorrido) {
        System.out.println(idRecorrido.mostrarAnimalesVistos());
    }
}
}
