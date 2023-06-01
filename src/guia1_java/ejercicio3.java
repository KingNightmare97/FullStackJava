
package guia1_java;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Escribir un programa que lea dos n�meros y realice el c�lculo de la
        suma, la resta, la multiplicaci�n y la divisi�n entre ambos valores.
        Los resultados deben mostrarse por pantalla.
        */
        
        System.out.println("Ingrese el primer n�mero:");
        String numero1 = scn.nextLine();
        
        System.out.println("Ingrese el segundo n�mero:");
        String numero2 = scn.nextLine();
        
        while (!numero1.matches("\\d{1,4}") || !numero2.matches("\\d{1,4}")) {
            while (!numero1.matches("\\d{1,4}")) {                
                System.out.println("Debe ingresar un Primer N�mero V�lido:");
                numero1 = scn.nextLine();
            }
            while (!numero2.matches("\\d{1,4}")) {                
                System.out.println("Debe ingresar un Segundo N�mero V�lido:");
                numero2 = scn.nextLine();
            }
        }
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        System.out.println("\nEl resultado al Sumar los dos N�meros: " + (num1 + num2) );
        System.out.println("\nEl resultado al Restar los dos N�meros: " + (num1 - num2) );
        System.out.println("\nEl resultado al Multiplicar los dos N�meros: " + (num1 * num2) );
        
        if (num2 == 0) {
            System.out.println("\nEl resultado al Dividir no se puede ya que el Segundo N�mero es un cero");
        } else {
            System.out.println("\nEl resultado al Dividir los dos N�meros: " + (num1 / num2) );
        }
    }
}
