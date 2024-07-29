/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases;


import java.util.Date;
/**
 *
 * @author camper
 */
public class Paciente extends Personas {
    private Date fechaNacimiento, fechaIngreso;

    public Paciente(String titulo, String nombre, String segundoNombre, String apellido, String direccion,
                    Date fechaNacimiento, Date fechaIngreso) {
        super(titulo, nombre, segundoNombre, apellido, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

}