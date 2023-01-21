/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**4    
 *
 * @author Elsner
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
   
    //la unica instancia que existe de esta clase
    private static Conexion conx = null;
    //atributos
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/karma2?serverTimezone";
    private static String user = "root";
    private static String password = "1234";
    
    //constructor
    private Conexion() {
        
    }
    
    public static Conexion getInstance(){
        //instanciamos la unica instancia de Conexion
        if(conx==null){
            conx = new Conexion();
        }
        return conx;
    }
     
    
    
    //metodos
    public static Connection getConnection() {    
        if (estaConectado()==false) {
            Conexion.crearConexion();
            
        }
        return con; 
    }
   
    @SuppressWarnings("UseSpecificCatch")
    public static boolean estaConectado()
    {
        boolean resp = false;
        try{
            if ((con==null) || (con.isClosed())){
                resp = false;
            }
            else{
                resp = true;
            }                 
        }
        catch(Exception e){
            System.out.println("Error al consultar el estado de la conexion: "+e.getMessage());
        }
        return resp;
    }
   
    public static void crearConexion()
    {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection(url, user, password);
           System.out.println("Se conectó a la BD karma_fashion_DB");
        } 
        catch (ClassNotFoundException e) {
           con=null;
           JOptionPane.showMessageDialog(null, "Error al cargar el driver!", "ERROR", JOptionPane.WARNING_MESSAGE);
           //System.out.println("Error al cargar el driver:" +e.getMessage());
        } 
        catch (SQLException e) {
           con=null;
           JOptionPane.showMessageDialog(null, "Error al establecer la conexion!", "ERROR", JOptionPane.WARNING_MESSAGE);
           //System.out.println("Error al establecer la conexion:" +e.getMessage());
       }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public static void closeConexion(Connection con){
        if(estaConectado()!=false){
            try{
                con.close();
                System.out.println("Cerrando la conexion");
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }
    }
    
    
    //Comprobacion del modulo de conexion
   
//    public static void main(String args[])
//    {
//          
//        new Conexion().getConnection();
//        
//        Conexion con = new Conexion();
//        Connection cn = con.getConnection();
//        con.closeConexion(cn);
//        
//    }

}