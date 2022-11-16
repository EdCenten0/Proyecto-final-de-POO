/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author cchav
 */
public class Clientes {
    private int cliente_id;
    private int tienda_id;
    private String nombre;
    private String cedula;
    private String numero_telefonico;
    private String email;
    private String direccion;
    private int sexo;
    private int estado;

    public Clientes() {
    }

    public Clientes(int cliente_id, int tienda_id, String nombre, String cedula, String numero_telefonico, String email, String direccion, int sexo, int estado) {
        this.cliente_id = cliente_id;
        this.tienda_id = tienda_id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.numero_telefonico = numero_telefonico;
        this.email = email;
        this.direccion = direccion;
        this.sexo = sexo;
        this.estado = estado;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getTienda_id() {
        return tienda_id;
    }

    public void setTienda_id(int tienda_id) {
        this.tienda_id = tienda_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(String numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
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
