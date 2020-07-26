package com.mycompany.tutorialesjava.variables;

/**
 *
 * @author David
 */
public class MiClaseDouble {
    public static void main(String[] args) {
        double a = 2.5;
        double b = 3.5;
        double c = a / b;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.printf("%.3f %s", c, " salida formateada");
    }
}
