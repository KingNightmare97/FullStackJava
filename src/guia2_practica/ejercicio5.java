package guia2_practica;

import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Escribir un algoritmo que lea un valor n por teclado y muestre los
        primeros n t�rminos de la sucesi�n de Fibonacci.
        
        Tip: la sucesi�n de Fibonacci comienza con 0, luego 1 y a partir de all�
        cada nuevo n�mero es la suma de los dos anteriores.
        */
        
        System.out.println("Ingrese un n�mero entero: ");
        String snum = scn.nextLine();
        
        while (!snum.matches("\\d{1,}")) {            
            System.out.println("Ingrese un n�mero entero V�lido: ");
            snum = scn.nextLine();
        }
        int valor1 = 0, valor2 = 1, suma = 1;
        int num_N = Integer.parseInt(snum);
        System.out.println(valor1);
        
        for (int i = 1; i < num_N; i++) {
            System.out.println(suma);
            
            suma = valor1 + valor2;
            
            valor1 = valor2;
            
            valor2 = suma;
            
        }
    }
}
