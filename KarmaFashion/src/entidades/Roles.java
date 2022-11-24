/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author DELL
 */
public class Roles {
    private int rolID;
    private String rol_name;
    private int estado;

    public Roles() {
    }

    public Roles(int rolID, String rol_name, int estado) {
        this.rolID = rolID;
        this.rol_name = rol_name;
        this.estado = estado;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getRol_name() {
        return rol_name;
    }

    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "" + rol_name;
    }
    
    
    
}
