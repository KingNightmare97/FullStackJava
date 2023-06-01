
package guia2_practica;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        /*
        Escribir un programa que reciba un número entero por teclado. A
        continuación, mostrar la tabla de multiplicar de ese número.
        */
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        String sEntero = scn.nextLine();
        
        while (!sEntero.matches("\\d{1,}")) {            
            System.out.println("Ingrese un número entero Válido: ");
            sEntero = scn.nextLine();
        }
        
        int n_entero = Integer.parseInt(sEntero);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(n_entero + " x " + i + " = " + (n_entero*i) + "\n");
        }
    }
}
