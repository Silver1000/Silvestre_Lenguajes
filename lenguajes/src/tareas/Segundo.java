/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
public class Segundo extends Thread {
    
    public void run(){
     while(true){   
    //Aqui pone la accion de tu thread
    System.out.println("Soy el segundo Thread que no hago nada");
         try {
             Thread.sleep(1000);//Para que descanse el thread
         } catch (InterruptedException ex) {
             Logger.getLogger(Segundo.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    }
    
}
