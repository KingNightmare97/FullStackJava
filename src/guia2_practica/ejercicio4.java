
package guia2_practica;
import java.util.Scanner;



public class ejercicio4 {
    
    
    public static void main(String[] args) {
        /*
        Escribir un algoritmo que calcule el factorial de un número ingresado
        por teclado.
        */
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        String sEntero = scn.nextLine();
        
        while (!sEntero.matches("\\d{1,}")) {            
            System.out.println("Ingrese un número entero Válido: ");
            sEntero = scn.nextLine();
        }
        
        int n_entero = Integer.parseInt(sEntero);
        int factorial = 1;
        for (int i = n_entero; i > 0; i--) {
            factorial = factorial*i;
        }
        
        System.out.println("El factorial de " + n_entero + " es igual a: " + factorial);
    }
}
