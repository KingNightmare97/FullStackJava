
package guia1_java;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        /*
        Escribir un programa que lea la estatura de tres personas, calcule el
        promedio de la altura de ellos y lo informe.
        */
        
        Scanner scn = new Scanner(System.in);
        String altura1;
        double num1;
        
        double vectorAltura[] = new double[3];
        
        for (int i = 0; i < vectorAltura.length; i++) {
            System.out.println("Ingrese la Altura nº " + (i+1) + ":");
            altura1 = scn.nextLine();
            while (!altura1.matches("\\d{1,}\\.\\d{2}")) {                
                System.out.println("Debe ingresar una Altura Válida:");
                System.out.println("Formato válido: 1.xx - 2.xx");
                altura1 = scn.nextLine();
            }
            num1 = Double.parseDouble(altura1);
            vectorAltura[i] = num1;
            
        }
        
        
        double promedio = 0;
        for (int i = 0; i < vectorAltura.length; i++) {
            promedio += vectorAltura[i];
            
        }
        promedio = promedio / 3;
        
       
        System.out.println("El Promedio de las tres alturas es: " + String.format("%.2f",promedio) + " cm");
        
        
        /*
        codigo viejo
        
        System.out.println("Ingrese tres alturas de personas\n");
        System.out.println("Ingrese la Primera Altura:");
        String altura1 = scn.nextLine();
        
        System.out.println("\nIngrese la Segunda Altura:");
        String altura2 = scn.nextLine();
        
        System.out.println("\nIngrese la Tercera Altura:");
        String altura3 = scn.nextLine();
        
        
        
        while (!altura1.matches("\\d{1,}\\.\\d{2}") || !altura2.matches("\\d{1,}\\.\\d{2}") || !altura3.matches("\\d{1,}\\.\\d{2}")) {            
            while (!altura1.matches("\\d{1,}\\.\\d{2}")) {                
                System.out.println("Debe ingresar una Primera Altura Válida:");
                altura1 = scn.nextLine();
            }
            while (!altura2.matches("\\d{1,}\\.\\d{2}")) {                
                System.out.println("Debe ingresar una Segunda Altura Válida:");
                altura2 = scn.nextLine();
            }
            while (!altura3.matches("\\d{1,}\\.\\d{2}")) {                
                System.out.println("Debe ingresar una Tercera Altura Válida:");
                altura3 = scn.nextLine();
            }
        }

        double num1 = Double.parseDouble(altura1);
        double num2 = Double.parseDouble(altura2);
        double num3 = Double.parseDouble(altura3);
        
        double promedio = ((num1+num2+num3)/3);
        
        */
    }
    
}
