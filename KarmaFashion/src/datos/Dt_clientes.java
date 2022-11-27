/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author cchav
 */
public class Dt_Clientes {
    
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT ClienteID,TiendaID,Nombre,Cedula,Numero_telefonico,Email,Direccion,Sexo,Estado FROM Cliente", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Clientes> listarClientes(){
        ArrayList<Clientes> listarClientes = new ArrayList<Clientes>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Clientes c = new Clientes();

                c.setCliente_id(rs.getInt("ClienteID"));
                c.setTienda_id(rs.getInt("TiendaID"));
                c.setNombre(rs.getString("Nombre"));
                c.setCedula(rs.getString("Cedula"));
                c.setNumero_telefonico(rs.getString("Numero_telefonico"));
                c.setEmail(rs.getString("Email"));
                c.setDireccion(rs.getString("Direccion"));
                c.setSexo(rs.getInt("Sexo"));
                c.setEstado(rs.getInt("Estado"));
                listarClientes.add(c); 
                
            }     
        }catch(SQLException e){
            System.out.println("El error en listarClientes(): "+e.getMessage());
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
        
        
        return listarClientes;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarClientes(Clientes clientes){
        boolean guardado = false;
        try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateInt("TiendaID", clientes.getTienda_id());
            rs.updateString("Nombre", clientes.getNombre());
            rs.updateString("Cedula", clientes.getNombre());
            rs.updateString("Numero_telefonico", clientes.getNumero_telefonico());
            rs.updateString("Email", clientes.getEmail());
            rs.updateString("Direccion", clientes.getDireccion());
            rs.updateInt("Sexo", clientes.getSexo());
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
    public boolean borrarCliente(int id){
        boolean resp = false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("ClienteID")==(id)){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deletePais(): "+e.getMessage());
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
    public boolean editarCliente(Clientes clientes){
       boolean resp = false;
       
       try{
          this.cargarDatos();
          rs.beforeFirst();
          while(rs.next()){
              if(rs.getInt("ClienteID")==(clientes.getCliente_id())){
                  rs.updateString("Cedula", clientes.getCedula());
                  rs.updateString("Nombre", clientes.getNombre());
                  rs.updateString("Numero_telefonico", clientes.getNumero_telefonico());
                  rs.updateString("Email", clientes.getEmail());
                  rs.updateString("Direccion", clientes.getDireccion());
                  rs.updateInt("Sexo", clientes.getSexo());
                  rs.updateInt("Estado", 2);
                  rs.updateRow();
                  resp = true;
                  break;
              }
          }
       }
       catch(SQLException e){
           System.out.println("Error en editarPais(): "+e.getMessage());
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
    
}
