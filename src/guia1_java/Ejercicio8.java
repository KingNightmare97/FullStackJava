
package guia1_java;

import java.util.Scanner;
public class Ejercicio8 {
    
    static void conversor(double celsius){
        double kelvin = 273.15;
        double Fahrenheit = 1.8;
        
        System.out.println("Grados Celsius Ingresado: " + celsius + "º");
        System.out.println("Celsius a Kelvin: " + String.format("%.2f",(kelvin+celsius)) + " ºK");
        System.out.println("Celsius a Fahrenheit: " + String.format("%.2f",(Fahrenheit*celsius)) + " ºF");
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Pedir al usuario que ingrese una temperatura en grados Celsius y
        mostrar por pantalla su equivalente en kelvin y grados Fahrenheit. Las
        fórmulas para conversiones son:
        
        Kelvin = 273,15 + Celsius
        Fahrenheit = 1,8 × Celsius
        */
        
        System.out.println("Ingrese una temperatura en grados Celsius:");
        System.out.println("Formato esperado: x.x - xx.x");
        String sgrados = scn.nextLine();
        
        while (!sgrados.matches("\\d{1,2}\\.\\d{1}")) {            
            System.out.println("Ingrese una temperatura en grados Celsius Válida:");
            sgrados = scn.nextLine();
        }
        
        double grados_C = Double.parseDouble(sgrados); 
        
        conversor(grados_C);
    }
}
