package edu.cundi.proyectomvc.Models;

/**
 *
 * @author diego parra 
 * @version 1.0.0
 * Clase Modelo
 */

public class Persona {
    /**
     * atributo nombre de la persona
     */
    private String nombre;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }
    /**
     * 
     * @param nombre parametro que guarda el nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  "" + nombre;
    }
    
}
