/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animals;

/**
 *
 * @author Jonathan
 */
public enum Zona {
    GRANJA("Granja"),
    CONTACTO("Contacto"),
    ALIMENTACION("Alimentacion"),
    CONSERVACIONYRESCATE("ConservacionYRescate"),
    TUNELNOCTURNO("TunelNocturno"),
    BIODIVERSIDADLOCAL("iodiversidadLocal");
    
    private final String Zona;

    public String getZona() {
        return Zona;
    }
    
    Zona(String Zona) {
        this.Zona = Zona;
    }

    @Override
    public String toString() {
        return "Zona" + "Zona=" + Zona;
    }
    
}
