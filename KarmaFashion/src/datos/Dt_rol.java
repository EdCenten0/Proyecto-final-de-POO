/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Roles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Francisco de Jesus Melendez Simplina
 */
public class Dt_rol {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT RolID,Rol_name,Estado FROM Rol", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Roles> listarRol(){
        ArrayList<Roles> listarol = new ArrayList<Roles>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Roles rol = new Roles();
                rol.setRolID(rs.getInt("RolID"));
                rol.setRol_name(rs.getString("Rol_name"));
                rol.setEstado(rs.getInt("Estado"));
                
                listarol.add(rol);
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
        
        
        return listarol;
}
    
    
    public boolean guardarRol (Roles rol)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //(nombre de la columna en sql, el atributo de la entidad)
            //rs.updateInt("department_id", dep.getDepartment_id());// el campo en la tabla es autoincremental
            //rs.updateInt("RolID", rol.getRolID());
            rs.updateString("Rol_name", rol.getRol_name());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarRol(): "+e.getMessage());
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
    public boolean existeRol(String s){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("Rol_name").equals(s)){
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
    public boolean editarRol(Roles rol)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("RolID")==rol.getRolID()){
                    rs.updateString("Rol_name", rol.getRol_name());
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
