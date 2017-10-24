/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author T-102
 */
public class Opcion {
    private String titulo;
    private Boolean correcta;

    public Opcion(String titulo, Boolean correcta) {
        this.titulo = titulo;
        this.correcta = correcta;
    }

  

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Boolean correcta) {
        this.correcta = correcta;
    }
          
    
}
