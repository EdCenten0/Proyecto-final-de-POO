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
 * @author Isabel Denisse Aguilar Vilchez 
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
            ps = con.prepareStatement("SELECT ProductoID, TipoproductoID, Nombre, Descripcion, Precio,Marca, Fecha_ingreso, Estado FROM Producto", 
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
        ArrayList<Productos> listaProd = new ArrayList<Productos>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Productos p = new Productos();
                /*d.setDepartment_id(rs.getInt("department_id"));
                d.setDepartment_name(rs.getString("department_name"));
                d.setLocation_id(rs.getInt("location_id"));
                listaDepto.add(d);*/
                p.setProducto_id(rs.getInt("ProductoID"));
                p.setTipo_producto(rs.getInt("TipoproductoID"));
                p.setNombre(rs.getString("Nombre"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setPrecio(rs.getFloat("Precio"));
                p.setMarca(rs.getString("Marca"));
                p.setFecha_ingreso(rs.getString("Fecha_ingreso"));
                p.setEstado(rs.getInt("Estado"));
                listaProd.add(p);
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
        
        
        return listaProd;      
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarProductos (Productos p)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //rs.updateInt("ProductoID", c.getProducto_id());
            rs.updateInt("TipoproductoID", p.getTipo_producto());
            rs.updateString("Nombre", p.getNombre());
            rs.updateString("Descripcion", p.getDescripcion());
            rs.updateDouble("Precio", p.getPrecio());
            rs.updateString("Marca", p.getMarca());
            rs.updateString("Fecha_ingreso", p.getFecha_ingreso());
            //rs.updateInt("Estado", c.getEstado());
            //rs.updateInt("region_id", c.getRegion_id());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarProductos(): "+e.getMessage());
            e.printStackTrace();
	}
	finally
	{
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
        //returnamos el valor de la bandera
	return guardado;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean existeProducto(Productos p){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("Nombre").equals(p.getNombre())){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeProducto(): "+e.getMessage());
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
		
        return resp;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarProductos(Productos p)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("ProductoID")==p.getProducto_id()){
                    rs.updateInt("TipoproductoID", p.getTipo_producto());
                    rs.updateString("Nombre", p.getNombre());
                    rs.updateDouble("Precio", p.getPrecio());
                    rs.updateString("Marca", p.getMarca());
                    rs.updateString("Fecha_ingreso", p.getFecha_ingreso());
                    rs.updateString("Descripcion", p.getDescripcion());
                    rs.updateInt("Estado", p.getEstado());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarProducto(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                    if(rs!=null){
                    rs.close();
                    }
                    if(ps!=null){
                        ps.close();
                    }
                    if(con!=null){
                        Conexion.closeConexion(con);
                    }
            }catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
        }
        return resp;
    }    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean deleteProductos(Productos p){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("ProductoID")==p.getProducto_id()){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteProductos(): "+e.getMessage());
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
		
        return resp;
    }
    
}
