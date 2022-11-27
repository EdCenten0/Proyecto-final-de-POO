/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author dagui
 */
public class TipoProductos {

    private String nombre;
    private String descripcion;
    private int estado;

    //constructor vacio
    public TipoProductos() {
    }
    
    //constructor
    public TipoProductos(String nombre, String descripcion, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}