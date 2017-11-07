/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    public static void main(String[] args) {
        
        GeneradorClientes g1=new GeneradorClientes();
       
        for(Cliente c:g1.generarClientes()){
            System.out.println("Nombre:"+c.getNombre()+" Edad:"+c.getEdad()+" Calle:"+c.getDireccion().getCalle()+
                    " Colonia:"+c.getDireccion().getColonia()+" Municipio:"+c.getDireccion().getMunicipio() 
                    +" Codigo Postal:"+c.getDireccion().getCp()+" Email:"+c.getEmail());
        }
    }
}
