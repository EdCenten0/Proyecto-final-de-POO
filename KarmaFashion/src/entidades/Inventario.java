/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Francisco de Jesus Melendez Simplina
 */
public class Inventario {
    private int inventarioID;
    private int bodegaoID;
    private int cant_inicial;
    private int movimiento_pos;
    private int movimiento_neg;
    private int precio;
    private String fecha;
    private int estado;

    public Inventario() {
    }

    public Inventario(int inventarioID, int bodegaoID, int cant_inicial, int movimiento_pos, int movimiento_neg, int precio, String fecha, int estado) {
        this.inventarioID = inventarioID;
        this.bodegaoID = bodegaoID;
        this.cant_inicial = cant_inicial;
        this.movimiento_pos = movimiento_pos;
        this.movimiento_neg = movimiento_neg;
        this.precio = precio;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getInventarioID() {
        return inventarioID;
    }

    public void setInventarioID(int inventarioID) {
        this.inventarioID = inventarioID;
    }

    public int getBodegaoID() {
        return bodegaoID;
    }

    public void setBodegaoID(int bodegaoID) {
        this.bodegaoID = bodegaoID;
    }

    public int getCant_inicial() {
        return cant_inicial;
    }

    public void setCant_inicial(int cant_inicial) {
        this.cant_inicial = cant_inicial;
    }

    public int getMovimiento_pos() {
        return movimiento_pos;
    }

    public void setMovimiento_pos(int movimiento_pos) {
        this.movimiento_pos = movimiento_pos;
    }

    public int getMovimiento_neg() {
        return movimiento_neg;
    }

    public void setMovimiento_neg(int movimiento_neg) {
        this.movimiento_neg = movimiento_neg;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
