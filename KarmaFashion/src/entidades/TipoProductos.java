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

    
    private int tipoProdId;
    private String nombre;
    private String descripcion;
    private int estado;

    //constructor vacio
    public TipoProductos() {
    }
    
    //constructor
    public TipoProductos(String nombre, String descripcion, int estado, int tipoProdId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoProdId = tipoProdId;
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

    public int getTipoProdId() {
        return tipoProdId;
    }

    public void setTipoProdId(int tipoProdId) {
        this.tipoProdId = tipoProdId;
    }
    
     @Override
    public String toString() {
        return this.getNombre();
    }
}
