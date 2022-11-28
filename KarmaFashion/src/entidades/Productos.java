/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author dagui
 */
public class Productos {

    //atributos
    
    
    private int producto_id;
    private int tipo_producto;
    private int inventario_id;
    private String nombre;
    private String descripcion;
    private float precio;
    private String marca;
    private String fecha_ingreso;
    private int estado;
    
    //constructor
    public Productos(){
        
    }
    
    //constructor2
    public Productos(int producto_id, int tipo_producto, int inventario_id, String nombre, String descripcion, float precio, String marca, String fecha_ingreso, int estado) {
        this.producto_id = producto_id;
        this.tipo_producto = tipo_producto;
        this.inventario_id = inventario_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
        this.fecha_ingreso = fecha_ingreso;
        this.estado = estado;
    }

    //getters and setters
    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(int tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public int getInventario_id() {
        return inventario_id;
    }

    public void setInventario_id(int inventario_id) {
        this.inventario_id = inventario_id;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
