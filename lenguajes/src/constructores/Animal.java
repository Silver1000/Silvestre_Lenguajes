/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Animal {
 private String Nombre;
    private int edad;
    private boolean muerde;
    
    //Realiza lo mismo que el setEdad
    public Animal(int edad){
    this.edad=edad;
    }
//Este es el constructor de defecto
    public Animal(){
        System.out.println("Estoy en el cuerpo del constructor de defecto");
        edad=5;
        Nombre="Voodoo";                
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }
   
    
}
