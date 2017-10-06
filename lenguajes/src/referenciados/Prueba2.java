/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

import abstraccion.Usuario;



public class Prueba2 {
    public static void main(String[] args) {
        /*Todos los referenciados perttenecen a una clase ademas 
        se necesita uno o mas primitivos para definirlos
        */
        String nombre="Silvestre";
        String otro=new String("Voodoo");//Constructor
        Usuario u=new Usuario();
        u.setAltura(1.7F);
        u.setPeso(71);
    }
}
