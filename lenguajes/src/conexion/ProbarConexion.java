/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

public class ProbarConexion {
    //static se ejecuta antes que otros metodos
    public static void main(String[] args) {
        Connection con=null;//se inicializa para que no quede vacia 
        try{
    con=    Conexion.conectarse("root", "");
            System.out.println("Te conectaste");
            //Aqui vienen querrys de mysql
    }catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
    }catch(SQLException e){
              System.out.println("Un error de sql "+e.getMessage());  
    }finally{
            try {
                //cierra la conexion si los datos estan incorrectos con ayuda del if
                if (con!=null)
                con.close();
                System.out.println("Ya se cerro todo");
            } catch (SQLException ex) {
               
            }
    }
                                            }
}
