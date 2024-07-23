/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia1;

/**
 *
 * @author jairb
 */
public class Camper{
    public int id, telefono;
    public String nombre ,apellido, direccion ,acudiente, estado;
    public boolean riesgo; 

    public Camper(int id, String nombre, String apellido, String direccion, String acudiente, int telefono, boolean riesgo, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefono = telefono;
        this.riesgo = riesgo;
        this.estado = estado;
    }
}
