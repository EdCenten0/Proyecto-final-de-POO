/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Provedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Dt_Provedores {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
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
    public ArrayList<Provedores> listarProvedores(){
        ArrayList<Provedores> listaProve = new ArrayList<Provedores>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Provedores pro = new Provedores();
                pro.setProvedorID(rs.getInt("ProveedorID"));
                pro.setTiendaID(rs.getInt("TiendaID"));
                pro.setNombre(rs.getString("Nombre"));
                pro.setTelefono(rs.getString("Telefono"));
                pro.setCedula(rs.getString("Cedula"));
                pro.setEmail(rs.getString("Email"));
                pro.setDireccion(rs.getString("Direccion"));
                pro.setSexo(rs.getInt("Sexo"));
                pro.setEstado(rs.getInt("Estado"));
                listaProve.add(pro);
            }     
        }catch(SQLException e){
            System.out.println("El error en listarDeptos(): "+e.getMessage());
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
        
        
        return listaProve;      
    }
}
