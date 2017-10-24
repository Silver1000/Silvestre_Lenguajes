/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.*;//Ocupa todo lo que contiene la libreria

/**
 *
 * @author T-102
 */
public class GeneradorCuestionario {
    
    public ArrayList <Pregunta>/*Generico a pregunta*/ generar(){
       
   //Primero generamos el arreglo que contendra las preguntas 
     ArrayList <Pregunta> preguntas=new ArrayList<Pregunta>();
       //Primero generamos cada opcion de la primer pregunta
       Opcion op11=new Opcion ("Moscu",false);
       Opcion op21=new Opcion ("Kiev",false);
       Opcion op31=new Opcion ("Helsinki",true);
       Opcion op41=new Opcion ("Turin",false);
       ArrayList<Opcion> opciones1=new ArrayList <>();
       opciones1.add(op11);
        opciones1.add(op21);
        opciones1.add(op31);
        opciones1.add(op41);
        
        Pregunta p1=new Pregunta ("Capital de Finlandia",opciones1);
        preguntas.add(p1);
        //fin de la primer pregunta
    return preguntas;
    }

    
}
