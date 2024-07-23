/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia1;

/**
 *
 * @author jairb
 */
import java.util.ArrayList;
import java.util.List;

public class AreaEntreno {
    public String nombre;
    public int capacidad;
    public List<Camper> campers;

    public AreaEntreno(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.campers = new ArrayList<>();
    }

    public boolean agregarCamper(Camper camper) {
        if (campers.size() < capacidad) {
            campers.add(camper);
            return true;
        } else {
            return false;
        }
    }
}

