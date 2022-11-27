/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author cchav
 */
public class Bodegas {
    
    private int bodegaID;
    private int tiendaID;
    private String nombre;
    private String no_documento;
    private int estado;

    public Bodegas() {
    }

    public Bodegas(int bodegaID, int tiendaID, String nombre, String no_documento, int estado) {
        this.bodegaID = bodegaID;
        this.tiendaID = tiendaID;
        this.nombre = nombre;
        this.no_documento = no_documento;
        this.estado = estado;
    }

    public int getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(int bodegaID) {
        this.bodegaID = bodegaID;
    }

    public int getTiendaID() {
        return tiendaID;
    }

    public void setTiendaID(int tiendaID) {
        this.tiendaID = tiendaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNo_documento() {
        return no_documento;
    }

    public void setNo_documento(String no_documento) {
        this.no_documento = no_documento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
