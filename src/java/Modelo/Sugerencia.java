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
public class Sugerencia {

    private int idsugerencia;
    private String nombre;
    private int id_condicion;
   
// contructutor vacio
    public Sugerencia() {
    }

    public Sugerencia(int idsugerencia, String nombre, int id_condicion) {
        this.idsugerencia = idsugerencia;
        this.nombre = nombre;
        this.id_condicion = id_condicion;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_condicion() {
        return id_condicion;
    }

    public void setId_condicion(int id_condicion) {
        this.id_condicion = id_condicion;
    }
    
    
}
