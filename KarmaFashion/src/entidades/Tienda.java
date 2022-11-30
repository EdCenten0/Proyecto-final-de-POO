/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author AZEPEDA
 */
public class Tienda {
    private int tiendaID;
    private String nombre;
    private String telefono;
    private String email;
    private String ruc;
    private String direccion;
    private String hora_abierto;
    private String hora_cerrado;
    private int estado;

    public Tienda() {
    }

    public Tienda(int tiendaID, String nombre, String telefono, String email,String ruc, String direccion,String hora_abierto, String hora_cerrado, int estado) {
        this.tiendaID = tiendaID;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ruc = ruc;
        this.direccion = direccion;
        this.hora_abierto = hora_abierto;
        this.hora_cerrado = hora_cerrado;
        this.estado = estado;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHora_abierto() {
        return hora_abierto;
    }

    public void setHora_abierto(String hora_abierto) {
        this.hora_abierto = hora_abierto;
    }

    public String getHora_cerrado() {
        return hora_cerrado;
    }

    public void setHora_cerrado(String hora_cerrado) {
        this.hora_cerrado = hora_cerrado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    }
    


