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
            ps = con.prepareStatement("SELECT TipoproductoID, Nombre, Descripcion, Estado FROM Tipoproducto", 
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
        ArrayList<TipoProductos> listaTipoProductos = new ArrayList<TipoProductos>();
        try{
            this.cargarDatos();
            while(rs.next()){
                TipoProductos tipProd = new TipoProductos();
                tipProd.setTipoProdId(rs.getInt("TipoproductoID"));
                tipProd.setNombre(rs.getString("Nombre"));
                tipProd.setDescripcion(rs.getString("Descripcion"));
                tipProd.setEstado(rs.getInt("Estado"));
                listaTipoProductos.add(tipProd);
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
         return listaTipoProductos;
    }
    
     @SuppressWarnings("CallToPrintStackTrace")
        public TipoProductos getTipoProductosByID(int idTipoProductos){
        TipoProductos tipo_productos = new TipoProductos();
        try{
            this.cargarDatos();
            while(rs.next()){
                if(idTipoProductos==rs.getInt("TipoproductoID")){
                    tipo_productos.setTipoProdId(rs.getInt("TipoproductoID"));
                    tipo_productos.setNombre(rs.getString("Nombre"));
                    tipo_productos.setDescripcion(rs.getString("Descripcion"));
                    break;
                }
                
            }     
        }catch(SQLException e){
            System.out.println("El error en getLocationByID(): "+e.getMessage());
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
        
        return tipo_productos;
    }    
}
