/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MONARCA
 */
public class Carrera {
  
    private int idcarrera;
    private String nombre;
    private int id_facultad;
   
// contructutor vacio

    public Carrera() {
    }

    public Carrera(int idcarrera, String nombre, int id_facultad) {
        this.idcarrera = idcarrera;
        this.nombre = nombre;
        this.id_facultad = id_facultad;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

}
