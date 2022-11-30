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
 * @author Carlos Eduardo Chavarria Centeno 
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
            ps = con.prepareStatement("SELECT BodegaID, TiendaID, Nombre, No_documento, Estado FROM Bodega", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
        @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Bodegas> listarBodegas(){
        ArrayList<Bodegas> listarBodegas = new ArrayList<Bodegas>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Bodegas b = new Bodegas();

                b.setBodegaID(rs.getInt("BodegaID"));
                b.setTiendaID(rs.getInt("TiendaID"));
                b.setNombre(rs.getString("Nombre"));
                b.setNo_documento(rs.getString("No_documento"));
                b.setEstado(rs.getInt("Estado"));
                
                
                listarBodegas.add(b); 
                
            }     
        }catch(SQLException e){
            System.out.println("El error en listarBodegas(): "+e.getMessage());
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
        
        
        return listarBodegas;      
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarBodegas(Bodegas bodegas){
        boolean guardado = false;
        try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateInt("TiendaID", bodegas.getTiendaID());
            rs.updateString("Nombre", bodegas.getNombre());
            rs.updateString("No_documento", bodegas.getNo_documento());
            rs.insertRow();
            rs.moveToCurrentRow();
            
            guardado = true;
        } catch (SQLException e) {
            System.out.println("ERROR guardarBodegas(): "+e.getMessage());
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
    public boolean borrarBodega(int id){
        boolean resp = false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("BodegaID")==(id)){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteBodega(): "+e.getMessage());
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
    public boolean editarBodega(Bodegas bodegas){
       boolean resp = false;
       
       try{
          this.cargarDatos();
          rs.beforeFirst();
          while(rs.next()){
              if(rs.getInt("BodegaID")==(bodegas.getBodegaID())){
                  
                    
                  rs.updateString("Nombre", bodegas.getNombre());
                  rs.updateString("No_documento", bodegas.getNo_documento());
                  rs.updateInt("Estado", 2);
                  
                  rs.updateRow();
                  resp = true;
                  break;
              }
          }
       }
       catch(SQLException e){
           System.out.println("Error en editarBodega(): "+e.getMessage());
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
