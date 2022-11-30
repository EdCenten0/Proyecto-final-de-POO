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
 * @author Isabel Denisse Aguilar Vilchez 
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
        
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarTipoProducto (TipoProductos tP)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            //(nombre de la columna en sql, el atributo de la entidad)
            //rs.updateInt("TipoproductoID", tP.getTipoProdId());// el campo en la tabla es autoincremental
            rs.updateString("Nombre", tP.getNombre());
            rs.updateString("Descripcion", tP.getDescripcion());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarDepto(): "+e.getMessage());
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
    public boolean editarTipoProducto(TipoProductos tP)
    {
        //declaramos una bandera en falso
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("TipoproductoID")==tP.getTipoProdId()){
                    rs.updateString("Nombre", tP.getNombre());
                    rs.updateString("Descripcion", tP.getDescripcion());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarDepto(): "+e.getMessage());
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
    public boolean deleteTipoProducto(TipoProductos tP){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("TipoproductoID")==tP.getTipoProdId()){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error deleteTipoProducto(): "+e.getMessage());
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
    public boolean existeTipoProducto(int id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("TipoproductoID")==(id)){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existeTipoProducto(): "+e.getMessage());
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

