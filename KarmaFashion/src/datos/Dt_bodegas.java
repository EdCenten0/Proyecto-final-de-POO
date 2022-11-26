package datos;

import entidades.Bodegas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cchav
 */
public class Dt_bodegas {
    
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT TiendaID ,Nombre, No_documento, Estado FROM Bodega", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
        @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Bodegas> listarClientes(){
        ArrayList<Bodegas> listarClientes = new ArrayList<Bodegas>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Bodegas b = new Bodegas();

                b.setTiendaID(rs.getInt(""));
                
                
                listarClientes.add(b); 
                
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
