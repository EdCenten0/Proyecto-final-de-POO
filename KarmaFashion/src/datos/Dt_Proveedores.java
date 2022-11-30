/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author AZEPEDA
 */
public class Dt_Proveedores {
     private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT ProveedorID,TiendaID,Nombre,Telefono,Cedula,Email,Direccion,Sexo,Estado FROM Proveedor", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Proveedores> listarProveedores(){
        ArrayList<Proveedores> listarProveedores = new ArrayList<Proveedores>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Proveedores p = new Proveedores();
                
                p.setProveedor_id(rs.getInt("ProveedorID"));
                p.setTienda_id(rs.getInt("TiendaID"));
                p.setNombre(rs.getString("Nombre"));
                p.setTelefono(rs.getString("Telefono"));
                p.setCedula(rs.getString("Cedula"));
                p.setEmail(rs.getString("Email"));
                p.setDireccion(rs.getString("Direccion"));
                p.setSexo(rs.getInt("Sexo"));
                p.setEstado(rs.getInt("Estado"));
                listarProveedores.add(p); 
                
            } 
        }catch(SQLException e){
            System.out.println("El error en listarProveedores(): "+e.getMessage());
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
        
        return listarProveedores;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarProveedores(Proveedores proveedores){
        boolean guardado = false;
        try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateInt("TiendaID", proveedores.getTienda_id());
            rs.updateString("Nombre", proveedores.getNombre());
            rs.updateString("Telefono", proveedores.getTelefono());
            rs.updateString("Cedula", proveedores.getCedula());
            rs.updateString("Email", proveedores.getEmail());
            rs.updateString("Direccion", proveedores.getDireccion());
            rs.updateInt("Sexo", proveedores.getSexo());
            rs.insertRow();
            rs.moveToCurrentRow();
            
            guardado = true;
        } catch (SQLException e) {
            System.out.println("ERROR guardarPais(): "+e.getMessage());
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
        return guardado;
    }
    
     @SuppressWarnings("CallToPrintStackTrace")
    public boolean borrarProveedor(int id){
        boolean resp = false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("ProveedorID")==(id)){
                    rs.deleteRow();
                    resp=true;
                }
            }
            } 
        catch (SQLException e) {
            System.out.println("Error deleteProveedor(): "+e.getMessage());
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
    public boolean editarProveedor(Proveedores proveedores){
       boolean resp = false;
       
       try{
          this.cargarDatos();
          rs.beforeFirst();
          while(rs.next()){
              if(rs.getInt("ProveedorID")==(proveedores.getProveedor_id())){
                  rs.updateInt("TiendaID",proveedores.getTienda_id());
                  rs.updateString("Nombre", proveedores.getNombre());
                  rs.updateString("Cedula", proveedores.getCedula());
                  rs.updateString("Telefono", proveedores.getTelefono());
                  rs.updateString("Email", proveedores.getEmail());
                  rs.updateString("Direccion", proveedores.getDireccion());
                  rs.updateInt("Sexo", proveedores.getSexo());
                  rs.updateInt("Estado", 2);
                  rs.updateRow();
                  resp = true;
                  break;
              }
          }
       }
       catch(SQLException e){
           System.out.println("Error en editarProveedor(): "+e.getMessage());
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
                   
                    e.printStackTrace();
            }
        }
        return resp;
    }
    
}
        
    

        

        
