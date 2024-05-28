package com.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Mundo!" );
        
     // TIPO DE DATOS PRIMITIVO: 
        // No tiene propiedades, ni metodos.
        int a = 10;

       // Los tipos de datos OBJETOS: 
        // Son un envoltorio de los tipos primitivos. Si tienen propiedades y metodos.
        // Por cada tipo primitivo existe un tipo objeto correspondiente. 

       Integer b = 20;
       
       // Para almacenar un valor en un float, hay que especificar un sufijo (f, F) porque sino considera 
      // el valor como un double, y un double no se puede almacenar en un float.
       // porque un double es mas grande que un float.
       // Ej: float c = 2.3f;
       // Tambien se podria hacer un type casting. ej: float c = (float) 2.3;

       float c = (float) 2.3;
           
        
    }
}
