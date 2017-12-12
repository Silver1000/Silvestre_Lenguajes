/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFinal;

/**
 *
 * @author T-102
 */
public class ProbarCliente {
    public static void main(String[] args) {
        Direccion d=new Direccion("Ignacio Zaragoza" , 55130l, "Ecatepec");
        Cliente c =new Cliente(1, "Jesus", 21, d);
        PersistenciaCliente pc=new PersistenciaCliente();
        
        try{
            System.out.println(pc.guardarCliente(c, d));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
