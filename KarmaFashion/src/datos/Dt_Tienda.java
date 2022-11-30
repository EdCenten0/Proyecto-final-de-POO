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
 * @author AZEPEDA
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
            ps = con.prepareStatement("SELECT TiendaID,Nombre,Telefono,Email,Ruc,Direccion,Hora_abierto,Hora_cerrado,Estado FROM Tienda", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarTienda(Tienda tie)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("tienda_id")==tie.getTiendaID()){
                    rs.updateString("Nombre", tie.getNombre());
                    rs.updateString("Telefono", tie.getTelefono());
                    rs.updateString("Email", tie.getEmail());
                    rs.updateString("Ruc", tie.getRuc());
                    rs.updateString("Direccion", tie.getDireccion());
                    rs.updateString("Hora_abierto", tie.getHora_abierto());
                    rs.updateString("Hora_cerrado", tie.getHora_abierto());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarTienda(): "+e.getMessage());
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
                t.setRuc(rs.getString("Ruc"));
                t.setDireccion(rs.getString("Direccion"));
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
    public boolean guardarTienda (Tienda tie)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //(nombre de la columna en sql, el atributo de la entidad)
            //rs.updateInt("department_id", dep.getDepartment_id());// el campo en la tabla es autoincremental
            rs.updateString("Nombre", tie.getNombre());
            rs.updateInt("TiendaID", tie.getTiendaID());
            rs.updateString("Telefono", tie.getTelefono());
            rs.updateString("Email", tie.getEmail());
            rs.updateString("Ruc", tie.getRuc());
            rs.updateString("Hora_abierto", tie.getHora_abierto());
            rs.updateString("Hora_cerrado", tie.getHora_abierto());
            rs.updateString("Direccion", tie.getDireccion());
            rs.updateInt("Estado", tie.getEstado());
            
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarTienda(): "+e.getMessage());
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
        
        return guardado;     
    }

    
  } 

}
