/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class GeneradorUsuario {
   
    public static void main(String[] args) {
    
    //Vamos a generar 5 Usuarios
        Usuario u1= new Usuario();
        u1.setEdad(23);
        u1.setEmail("gmail@gmail.com");
        u1.setNombre("Javier");
         Usuario u2= new Usuario();
        u2.setEdad(25);
        u2.setEmail("google@gmail.com");
        u2.setNombre("Pablo");
         Usuario u3= new Usuario();
        u3.setEdad(27);
        u3.setEmail("metro@gmail.com");
        u3.setNombre("Claudia");
         Usuario u4= new Usuario();
        u4.setEdad(21);
        u4.setEmail("bus@gmail.com");
        u4.setNombre("Berenice");
         Usuario u5= new Usuario();
        u5.setEdad(22);
        u5.setEmail("auto@gmail.com");
        u5.setNombre("Manuel");
     //Generaremosunarreglo mutable
     
    ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
     usuarios.add(u1);//agrega usuarios al arreglo
     usuarios.add(u2);
     usuarios.add(u3);
     //Vamos a iterarlo para verlos nombres
     for (Usuario u:usuarios){
         System.out.println("Nombre:"+u.getNombre()+" Edad:"+u.getEdad()+" Email:"+u.getEmail());
     }
     
     
     
    }
    

}
