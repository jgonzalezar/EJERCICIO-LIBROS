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
public class PruebaLibro {
    public static void main(String[] args) {
        //esto es una dependencia
        ConjuntoLibros biblioteca =
               new ConjuntoLibros();
        
        Autor autor = new Autor("Gabriel","Garcia");
        Libro libro = new Libro("Cien ", 300,8);
        libro.setAutor(autor);
        
        boolean resultado = biblioteca.anadirLibro(libro);
        if(resultado == true){
            System.out.println("Insercion satisfactoria");
        }else{
            System.out.println("Problemas para insertar libro");
        }
    }
    
}
