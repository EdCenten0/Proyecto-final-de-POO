/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.TipoProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dagui
 */
public class dt_TipoProductos {
    //atributos
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    //metodos
     @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection(); //obtenemos la conexion a la base de datos
            ps = con.prepareStatement("SELECT Nombre, Descripcion, Estado FROM Tipoproducto", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<TipoProductos> listarTipoProductos(){
        ArrayList<TipoProductos> listarTipProd = new ArrayList<TipoProductos>();
        try{
            this.cargarDatos();
            while(rs.next()){
                TipoProductos tipProd = new TipoProductos();
                tipProd.setNombre(rs.getString("Nombre"));
                tipProd.setDescripcion(rs.getString("Descripcion"));
                tipProd.setEstado(rs.getInt("Estado"));
                listarTipProd.add(tipProd);
            }
        }catch(SQLException e){
            System.out.println("El error en listarTipoProductos(): "+e.getMessage());
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
         return listarTipProd;
    }
}