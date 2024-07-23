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

public class Rutas {
    public String nombre;
    public List<Modulo> modulos;

    public Rutas(String nombre) {
        this.nombre = nombre;
        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }
}
