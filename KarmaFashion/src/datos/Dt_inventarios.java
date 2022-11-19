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
public class Dt_Inventarios {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT InventarioID,BodegaID,Cant_inicial,Movimiento_pos,Movimiento_neg,Saldo_final,Fecha,estado FROM Inventario", 
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
                inv.setBodegaoID(rs.getInt("BodegaID"));
                inv.setCant_inicial(rs.getInt("Cant_inicial"));
                inv.setMovimiento_pos(rs.getInt("Movimiento_pos"));
                inv.setMovimiento_neg(rs.getInt("Movimiento_neg"));
                inv.setPrecio(rs.getInt("Saldo_final"));
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
    
    
   
}
