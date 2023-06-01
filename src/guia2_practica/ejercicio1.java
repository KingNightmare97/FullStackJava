
package guia2_practica;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        /*
        Escribir un programa que reciba un n�mero entero por teclado. A
        continuaci�n, mostrar la tabla de multiplicar de ese n�mero.
        */
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese un n�mero entero: ");
        String sEntero = scn.nextLine();
        
        while (!sEntero.matches("\\d{1,}")) {            
            System.out.println("Ingrese un n�mero entero V�lido: ");
            sEntero = scn.nextLine();
        }
        
        int n_entero = Integer.parseInt(sEntero);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(n_entero + " x " + i + " = " + (n_entero*i) + "\n");
        }
    }
}
