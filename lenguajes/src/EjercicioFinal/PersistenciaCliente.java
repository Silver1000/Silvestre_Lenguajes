/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFinal;
import java.sql.*;
/**
 *
 * @author T-102
 */
public class PersistenciaCliente {

    
    public static void main(String[] args)   
    {
    
    
    
    }
}







/* borrar todos
  Connection con=null;
        try{
                con=    Conexion.conectarse("root", "");
            System.out.println("Te conectaste");
    PreparedStatement st=con.prepareStatement("Delete * from Cliente");
     st.execute();
     st.close();
     System.out.println("Registros Borrados");
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
    */
    /*buscar todos
       try{
    con=    Conexion.conectarse("root", "");//usuario y contraseña del wampserver
            System.out.println("Te conectaste");
        Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from Cliente");
           
            ArrayList<Cliente> registros=new ArrayList<>();
            while (rs.next()){
            Cliente c=new Cliente();
            c.setId(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setEdad(rs.getInt(3));
            c.setDireccion(rs.)
            registros.add(c);
            }
            for(Cliente c:registros){
                System.out.println("ID:"+c.getId()+" Nombre:"+c.getNombre()+" Edad:"+c.getEdad()+" Direccion:"+c.getDireccion());
            }
            st.close();  
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
    */
    /*buscar id
      Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select from Cliente where Id=1");
           
            ArrayList<Cliente> registros=new ArrayList<>();
            while (rs.next()){
            Cliente c=new Cliente();
            c.setId(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setEdad(rs.getInt(3));
            c.setDireccion(rs.)
            registros.add(c);
            }
            for(Cliente c:registros){
                System.out.println("ID:"+c.getId()+" Nombre:"+c.getNombre()+" Edad:"+c.getEdad()+" Direccion:"+c.getDireccion());
            }
            st.close();
    */
    
    /* borrar id
    Connection con=null;
        try{
                con=    Conexion.conectarse("root", "");
            System.out.println("Te conectaste");
    PreparedStatement st=con.prepareStatement("Delete from Cliente where Id=1");
     st.execute();
     st.close();
     System.out.println("Registro Borrado");
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
    
    */
    /*Guardar cliente  
    Connection con=null;
        try{
                con=    Conexion.conectarse("root", "");
            System.out.println("Te conectaste");
     PreparedStatement st=con.prepareStatement("insert into Cliente values(?,?,?,?)");
             st.setInt(1, 1);//primer numero de la columna,segundo el valor a insertar 
             st.setString(2, "Silvestre");
             st.setInt(3, 21);
             st.setString(4, "Ignacio Zaragoza");
             st.execute();
             
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
    */