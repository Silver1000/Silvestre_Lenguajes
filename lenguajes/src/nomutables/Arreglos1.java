/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutables;

/**
 *
 * @author T-102
 */
public class Arreglos1 {
    public static void main(String[] args) {
        //Vamos a generar un arreglo simple
        int x[]={12,-4,7};
        System.out.println("El tamaño es "+x.length);
        //Para acceder a un elemento hacemos lo siguiente
        System.out.println("En el indice 0 esta "+x[2]);
        int []y={2,4,5};
        //solamente indica el tamaño y es tratado como un objeto
        int []z=new int [3];
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        //Vamos a iterar el arreglo z usando el ciclo for
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }
        //Aqui veremos el ciclo for mejorado, desventaja:no se puede incrementar de 2 en 2
        for(int valor:z){
            System.out.println("Mejorado "+valor);
        }
        //Compresion de un string a byte
        String mensaje="Hola como estas";
        byte []w=mensaje.getBytes();
        System.out.println("Tamaño "+w.length);
        for (byte valor2:w){
            System.out.println("El byte es "+valor2);
        }
        //Muestra los valores en una sola linea
        String codificado="";
          for (byte valor2:w){
            System.out.println("El byte es "+valor2);
            codificado=codificado+valor2;
        }
          System.out.println("El mensaje codificado es");
          System.out.println(codificado);
    }
   

}
