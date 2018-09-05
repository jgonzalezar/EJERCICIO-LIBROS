/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libros;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    //asociacion cardinalidad 10(tamaño maximo conocido)
    private Libro[] libros;
    
    
    public ConjuntoLibros() {
        this.libros = new Libro [10];
    }    
    
    public boolean anadirLibro(Libro libro){
        for (int i=0; i< this.libros.length; i++){
           if(this.libros[i]==null){
               this.libros[i]=libro;
               return true;
           }      
       }
       return false;
    }
    
    
    public boolean eliminarLibroxTitulo(String titulo){
        for(int i=0; i<this.libros.length;i++){
            if(this.libros[i].getTitulo().equals(titulo) && this.libros[i] != null){
                this.libros[i]= null;
                return true;
            }
        }
        return false;
    }
    
    
    public boolean eliminarLibroxAutor(String autor){
        for(int i=0; i<this.libros.length;i++){
            if(this.libros[i].getAutor().equals(autor)){
                this.libros[i]= null;
                return true;
            }
        }
        return false;
    }
    
    
    public Libro buscarMejorCalificacdo(){
        Libro mejor= null;
        for(int i=0; i<this.libros.length;i++){
            if(i==0){
               mejor = this.libros[i];
               return mejor;
        }else{
                if(this.libros[i].getCalificacion() > mejor.getCalificacion()){
                    mejor = this.libros[i];
                }
            }
      
    }
        return mejor;
    }
    
    /*public Libro MostrarLibros(){
        for(int i =0;i<this.libros.length;i++){
        return this.libros[i];
        }
        return 0;
    }*/

}
