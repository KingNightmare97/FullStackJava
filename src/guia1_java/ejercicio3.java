
package guia1_java;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Escribir un programa que lea dos números y realice el cálculo de la
        suma, la resta, la multiplicación y la división entre ambos valores.
        Los resultados deben mostrarse por pantalla.
        */
        
        System.out.println("Ingrese el primer número:");
        String numero1 = scn.nextLine();
        
        System.out.println("Ingrese el segundo número:");
        String numero2 = scn.nextLine();
        
        while (!numero1.matches("\\d{1,4}") || !numero2.matches("\\d{1,4}")) {
            while (!numero1.matches("\\d{1,4}")) {                
                System.out.println("Debe ingresar un Primer Número Válido:");
                numero1 = scn.nextLine();
            }
            while (!numero2.matches("\\d{1,4}")) {                
                System.out.println("Debe ingresar un Segundo Número Válido:");
                numero2 = scn.nextLine();
            }
        }
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        System.out.println("\nEl resultado al Sumar los dos Números: " + (num1 + num2) );
        System.out.println("\nEl resultado al Restar los dos Números: " + (num1 - num2) );
        System.out.println("\nEl resultado al Multiplicar los dos Números: " + (num1 * num2) );
        
        if (num2 == 0) {
            System.out.println("\nEl resultado al Dividir no se puede ya que el Segundo Número es un cero");
        } else {
            System.out.println("\nEl resultado al Dividir los dos Números: " + (num1 / num2) );
        }
    }
}
