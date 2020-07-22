package com.mycompany.tutorialesjava.variables;

/**
 *
 * @author David
 */
public class MiClaseString {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        
        // FORMAS DE DECLARAR VARIABLES
        String nombre;
        nombre = "David";
        
        String apellido = "León";
        
        String edad1 = "1";
        String edad2 = "2";
        String edad3 = edad1 + edad2;
        
        // el espacio en JAVA también cuenta como carácter
        System.out.println(nombre + " " + apellido + " " + edad3);
        
    }
}
