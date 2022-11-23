/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Francisco de Jesus Melendez Simplina
 */
public class Inventarios {
    private int inventarioID;
    private int bodegaID;
    private int cant_inicial;
    private int movimiento_pos;
    private int movimiento_neg;
    private int saldo_final;
    private String fecha;
    private int estado;

    public Inventarios() {
    }

    public Inventarios(int inventarioID, int bodegaID, int cant_inicial, int movimiento_pos, int movimiento_neg, int saldo_final, String fecha, int estado) {
        this.inventarioID = inventarioID;
        this.bodegaID = bodegaID;
        this.cant_inicial = cant_inicial;
        this.movimiento_pos = movimiento_pos;
        this.movimiento_neg = movimiento_neg;
        this.saldo_final = saldo_final;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getInventarioID() {
        return inventarioID;
    }

    public void setInventarioID(int inventarioID) {
        this.inventarioID = inventarioID;
    }

    public int getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(int bodegaoID) {
        this.bodegaID = bodegaID;
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

    public int getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(int precio) {
        this.saldo_final = precio;
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

    @Override
    public String toString() {
        return "Inventarios{" + "bodegaoID=" + bodegaID + '}';
    }
    
    
    
}
