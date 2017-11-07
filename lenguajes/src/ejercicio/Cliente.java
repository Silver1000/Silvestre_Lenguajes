/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class Cliente {
   //b)
    public Cliente(){

}
    //c)
    public Cliente(String nombre,int edad,String email,Direccion direccion){
    this.nombre=nombre;
    this.edad=edad;
    this.direccion=direccion;
    this.email=email;
    
    }
    //a)
    private String nombre;
    private int edad;
    private String email;
    private Direccion direccion;
    private ArrayList <Cliente> clientes;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList <Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList <Cliente> clientes) {
        this.clientes = clientes;
    }

   
} 

