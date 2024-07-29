/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases;

import java.util.List;

/**
 *
 * @author camper
 */
 public class Hospital {
    private String nombre;
    private List<Departamento> departamentos;
    private List<Personas> personas;

    // Constructor
    public Hospital(String nombre, List<Departamento> departamentos, List<Personas> personas) {
        this.nombre = nombre;
        this.departamentos = departamentos;
        this.personas = personas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public List<Personas> getPersonas() {
        return personas;
    }
}
