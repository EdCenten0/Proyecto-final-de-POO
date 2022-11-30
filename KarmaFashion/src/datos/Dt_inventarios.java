/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Inventarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Francisco de Jesus Melendez Simplina
 */
public class Dt_inventarios {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT InventarioID,BodegaID,ProductoID,Cant_inicial,Movimiento_pos,Movimiento_neg,Saldo_final,Fecha,estado FROM Inventario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Inventarios> listarInventario(){
        ArrayList<Inventarios> listaInvent = new ArrayList<Inventarios>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Inventarios inv = new Inventarios();
                inv.setInventarioID(rs.getInt("InventarioID"));
                inv.setBodegaID(rs.getInt("BodegaID"));
                inv.setProductoID(rs.getInt("ProductoID"));
                inv.setCant_inicial(rs.getInt("Cant_inicial"));
                inv.setMovimiento_pos(rs.getInt("Movimiento_pos"));
                inv.setMovimiento_neg(rs.getInt("Movimiento_neg"));
                inv.setSaldo_final(rs.getInt("Saldo_final"));
                inv.setFecha(rs.getString("Fecha"));
                inv.setEstado(rs.getInt("estado"));
                listaInvent.add(inv);
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
        
        
        return listaInvent;      
    }
    
    public boolean guardarInventario (Inventarios inv)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            
            this.cargarDatos();

            rs.moveToInsertRow();
            rs.updateInt("BodegaID", inv.getBodegaID());
            rs.updateInt("ProductoID", inv.getProductoID());
            rs.updateInt("Cant_inicial", inv.getCant_inicial());
            rs.updateInt("Movimiento_pos", inv.getMovimiento_pos());
            rs.updateInt("Movimiento_neg", inv.getMovimiento_neg());
            rs.updateInt("Saldo_final", inv.getSaldo_final());
            rs.updateString("Fecha", inv.getFecha()); 
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
    public boolean editarInventario(Inventarios inv){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("InventarioID")==(inv.getInventarioID())){
                    rs.updateString("Fecha",inv.getFecha());
                    rs.updateInt("BodegaID", inv.getBodegaID());
                    rs.updateInt("ProductoID", inv.getProductoID());
                    rs.updateInt("Cant_inicial", inv.getCant_inicial());
                    rs.updateInt("Saldo_final", inv.getSaldo_final());
                    rs.updateInt("Movimiento_neg", inv.getMovimiento_neg());
                    rs.updateInt("Movimiento_pos", inv.getMovimiento_pos());
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
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean eliminarInventario(int inv){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("InventarioID")==(inv)){
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
    public boolean existeInventario(int id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("InventarioID")==(id)){
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
    public int AumentadorInventario(int id){
        int aumentador = 0;
        
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("InventarioID")==(id)){
                    aumentador = rs.getInt("Saldo_final");
                    
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
		
        return aumentador;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public int Movimiento(Inventarios inv){
        int aumentador = 0;
        
        try {
            this.cargarDatos();
            while(rs.next()){
                rs.moveToCurrentRow();

                if(rs.getInt("InventarioID")==(inv.getInventarioID())){

            rs.moveToInsertRow();
            rs.updateInt("BodegaID", inv.getBodegaID());
            rs.updateInt("ProductoID", inv.getProductoID());
            rs.updateInt("Cant_inicial", inv.getCant_inicial());
            rs.updateInt("Movimiento_pos", inv.getMovimiento_pos());
            rs.updateInt("Movimiento_neg", inv.getMovimiento_neg());
            rs.updateInt("Saldo_final", inv.getSaldo_final());
            rs.updateString("Fecha", inv.getFecha()); 
            rs.insertRow();
            rs.moveToCurrentRow();
            

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
		
        return aumentador;
    }
    
   
}
