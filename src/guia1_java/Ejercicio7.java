
package guia1_java;

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Escribir un programa que reciba el valor de dos edades y las guarde
        en dos variables. Luego el programa debe intercambiar los valores de
        ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
        ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
        mostrar edad1 = 35 y edad2 = 24.
        
        Tip: para intercambiar los valores de dos variables se debe utilizar
        una variable auxiliar.
        */
        
        // lo escaneo en formato string para luego hacer una verificacion
            
        
        System.out.println("Ingrese la primera edad:");
        String sEdad = scn.nextLine();
        
        System.out.println("Ingrese la segunda edad:");
        String sEdad2 = scn.nextLine();
        //verifico que ingrese solo numeros y en un formato esperado
        while (!sEdad.matches("\\d{1,2}") || !sEdad2.matches("\\d{1,2}")) {
            while (!sEdad.matches("\\d{1,2}")) {                
                System.out.println("Debe ingresar una Primera Edad Válida:");
                sEdad = scn.nextLine();
            }
            while (!sEdad2.matches("\\d{1,2}")) {                
                System.out.println("Debe ingresar una Segunda Edad Válida:");
                sEdad2 = scn.nextLine();
            }
        }
        // convierto las 2 variables string a integer
        int edad_new1 = Integer.parseInt(sEdad);
        int edad_new2 = Integer.parseInt(sEdad2);
        int edad_cambio = edad_new2;
        
        edad_new2 = edad_new1;
        edad_new1 = edad_cambio;
        
        System.out.println("Edad1: " + edad_new1);
        System.out.println("Edad2: " + edad_new2);
    }
}
