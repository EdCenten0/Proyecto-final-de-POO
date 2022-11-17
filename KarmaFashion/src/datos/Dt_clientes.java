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
public class Dt_clientes {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT ClienteID, TiendaID, Nombre, Cedula, Numero_telefonico, Email, Direccion, Sexo, Estado FROM Cliente", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Clientes> listarDeptos(){
        ArrayList<Clientes> listarClientes = new ArrayList<Clientes>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Clientes c = new Clientes();
//                d.setDepartment_id(rs.getInt("department_id"));
//                d.setDepartment_name(rs.getString("department_name"));
//                d.setLocation_id(rs.getInt("location_id"));
//                listaDepto.add(d);
                c.setCliente_id(rs.getInt("ClienteID"));
                c.setTienda_id(rs.getInt("TiendaID"));
                c.setNombre(rs.getString("Nombre"));
                c.setCedula(rs.getString("Cedula"));
                c.setNumero_telefonico(rs.getString("Numero_telefonico"));
                c.setEmail(rs.getString("Email"));
                c.setDireccion(rs.getString("Direccion"));
                c.setSexo(rs.getInt("Sexo"));
                c.setEstado(rs.getInt("Estado"));
                
                

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
    
}
