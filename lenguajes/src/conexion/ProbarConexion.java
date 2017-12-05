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
    con=    Conexion.conectarse("root", "");//usuario y contraseña del wampserver
            System.out.println("Te conectaste");
            //Aqui vienen querrys de mysql
             //Con la conexion que se llama con
             //vamos a generar una sentencia la cual es una clase
             /* Statement st=con.createStatement();*/   
             //Generamos la tablita
            /* st.execute("create table tablita(id integer primary key, Nombre varchar(10))");
             st.close();
              System.out.println("Tabla Generada con exito");*/
             //tambien se cierra las sentencias al igual que las condiciones
             //update instruccion PreparedStatement st=con.prepareStatement("update tablita set nombre=? where id=?");
             //Caso 1: Insert
             PreparedStatement st=con.prepareStatement("insert into tablita values(?,?)");
             st.setInt(1, 1);//primer numero de la columna,segundo el valor a insertar 
             st.setString(2, "Silvestre");
             st.execute();//ejecuta el insert introducido
             st.close();
             System.out.println("Registro insertado");
             
            
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
