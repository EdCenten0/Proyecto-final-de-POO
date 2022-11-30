/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco de Jesus Melendez Simplina
 */
public class Dt_usuarios {
    
  
    //Conexion
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT UsuarioID,RolID,Username,Clave,Estado FROM Usuario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Usuarios> listarUsuarios(){
        ArrayList<Usuarios> listauser = new ArrayList<Usuarios>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Usuarios user = new Usuarios();
                user.setUsuarioID(rs.getInt("UsuarioID"));
                user.setRolID(rs.getInt("RolID"));
                user.setUsername(rs.getString("Username"));
                user.setClave(rs.getString("Clave"));
                user.setEstado(rs.getInt("Estado"));
                listauser.add(user);
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
        
        
        return listauser;
}
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean validarUsuario(String user, String pwd){
	boolean acceso=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("Username").equals(user) && rs.getString("Clave").equals(pwd)){
                    acceso=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error validarUsuario(): "+e.getMessage());
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
		
        return acceso;
    }

    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean existeUsuario(String username){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("Username").equals(username)){
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
    
    public boolean guardarUsuario (Usuarios u)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            
            this.cargarDatos();

            rs.moveToInsertRow();
            rs.updateInt("RolID", u.getRolID());
            rs.updateString("Username", u.getUsername());
            rs.updateString("Clave", u.getClave()); 
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
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
        //returnamos el valor de la bandera
	return guardado;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean eliminarUsuario(int id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("UsuarioID")==id){
                    rs.deleteRow();
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
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarUsuario(Usuarios user){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("UsuarioID")==(user.getUsuarioID())){
                    rs.updateString("Username",user.getUsername() );
                    rs.updateString("Clave",user.getClave() );
                    rs.updateInt("RolID", user.getRolID());
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
