package com.mycompany.tutorialesjava.variables;

/**
 *
 * @author David
 */
public class MiClaseOperadores {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        
        System.out.println("suma: " + (a + b));
        System.out.println("producto: " + (a * b));
        System.out.println("división: " + (a / b));
                
        int c = ++a;
        
        System.out.println("C: " + c);
        System.out.println(a);
        
        c += b;
        
        System.out.println("nuevo C: " + c);
    }
    
}
