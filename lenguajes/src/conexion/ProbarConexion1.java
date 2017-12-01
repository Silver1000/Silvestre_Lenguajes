/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

public class ProbarConexion1 {
    //static se ejecuta antes que otros metodos
    public static void main(String[] args) {
        Connection con=null;//se inicializa para que no quede vacia 
        try{
    con=    Conexion.conectarse("root", "");//usuario y contraseña del wampserver
            System.out.println("Te conectaste");
            //Aqui vienen querrys de mysql
            //Caso espcecial del select
            //Paso 1 Generar una consulta(querry)
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from tablita");
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
