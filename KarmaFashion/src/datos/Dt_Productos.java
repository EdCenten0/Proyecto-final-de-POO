/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Elsner
 */
public class Dt_Productos{
    //atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT ProductoID, TipoproductoID, InventarioID, Nombre, Descripcion, Precio, Marca, Fecha_ingreso, Estado FROM Producto", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Productos> listarProductos(){
        ArrayList<Productos> listarProd = new ArrayList<Productos>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Productos p = new Productos();
                /*d.setDepartment_id(rs.getInt("department_id"));
                d.setDepartment_name(rs.getString("department_name"));
                d.setLocation_id(rs.getInt("location_id"));
                listaDepto.add(d);*/
                p.setProducto_id(rs.getInt("producto_id"));
                p.setTipo_producto(rs.getInt("tipo_producto"));
                p.setInventario_id(rs.getInt("inventario_id"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getFloat("precio"));
                p.setMarca(rs.getString("marca"));
                p.setFecha_ingreso(rs.getString("fecha_ingreso"));
                p.setEstado(rs.getInt("estado"));
                listarProd.add(p);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarProd(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }  
        }
        
        
        return listarProd;      
    }
    
    
    
}
