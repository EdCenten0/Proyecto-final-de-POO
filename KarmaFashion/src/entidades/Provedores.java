/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author DELL
 */
public class Provedores {
    private int provedorID;
    private int tiendaID;
    private String nombre;
    private String telefono;
    private String cedula;
    private String email;
    private String direccion;
    private int sexo;
    private int estado;

    public Provedores() {
    }

    public Provedores(int provedorID, int tiendaID, String nombre, String telefono, String cedula, String email, String direccion, int sexo, int estado) {
        this.provedorID = provedorID;
        this.tiendaID = tiendaID;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.email = email;
        this.direccion = direccion;
        this.sexo = sexo;
        this.estado = estado;
    }

    public int getProvedorID() {
        return provedorID;
    }

    public void setProvedorID(int provedorID) {
        this.provedorID = provedorID;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
