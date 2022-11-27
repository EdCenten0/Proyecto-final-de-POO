/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Tienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Dt_Tienda {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT TiendaID,Nombre,Telefono,Email,Direccion,Ruc,Hora_abierto,Hora_cerrado,Estado FROM Tienda", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Tienda> listarTienda(){
        ArrayList<Tienda> listarTienda = new ArrayList<Tienda>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Tienda t = new Tienda();

                t.setTiendaID(rs.getInt("TiendaID"));
                t.setNombre(rs.getString("Nombre"));
                t.setTelefono(rs.getString("Telefono"));
                t.setEmail(rs.getString("Email"));
                t.setDireccion(rs.getString("Direccion"));
                t.setRuc(rs.getString("Ruc"));
                t.setHora_abierto(rs.getString("Hora_abierto"));
                t.setHora_cerrado(rs.getString("Hora_cerrado"));
                t.setEstado(rs.getInt("Estado"));
                listarTienda.add(t); 
                
            }     
        }catch(SQLException e){
            System.out.println("El error en listarTienda(): "+e.getMessage());
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
        
        
        return listarTienda;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarTienda(Tienda tien){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("TiendaID")==(tien.getTiendaID())){
                    rs.updateString("Nombre",tien.getNombre());
                    rs.updateString("Telefono",tien.getTelefono());
                    rs.updateString("Email",tien.getEmail());
                    rs.updateString("Direccion",tien.getEmail());
                    rs.updateString("Ruc",tien.getRuc());
                    rs.updateString("Hora_abierto",tien.getHora_abierto());
                    rs.updateString("Hora_cerrado",tien.getHora_cerrado());
                    
                    rs.updateRow();
                    
                    
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existePais(): "+e.getMessage());
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
