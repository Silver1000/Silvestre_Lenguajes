/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.*;

/**
 *
 * @author T-102
 */
public class GeneradorClientes {
   
        //a)
        public ArrayList <Cliente> generarClientes(){
        //b
        ArrayList <Cliente> clientes=new ArrayList <Cliente>();
        Direccion d1=new Direccion("Ignacio","Anahuac",55210,"Ecatepec");
        Direccion d2=new Direccion("Zaragoza","Valle",58120,"Morelos");
        Direccion d3=new Direccion("Lopez","Abastos",78030,"Hildalgo");
        Cliente c1=new Cliente("Samuel",20,"gmail",d1);      
        Cliente c2=new Cliente("Samantha",22,"gmail",d2); 
        Cliente c3=new Cliente("Bere",23,"gmail",d3); 
        
        //c)
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
            return clientes;    
        }     
        
        
        
        
    
    
}
