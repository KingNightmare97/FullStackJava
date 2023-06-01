
package guia2_practica;

import java.util.Scanner;
import java.util.Arrays;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        Escribir un programa que ordene un arreglo de números enteros de
        manera ascendente.
        */
        
        String senteros;
        int n_enteros;
        
        int array_enteros[] = new int[10];
        
        for (int i = 0; i < array_enteros.length; i++) {
            System.out.println("Ingrese el nº " + (i+1) + " entero:");
            senteros = scn.nextLine();
            while (!senteros.matches("\\d{1,}")) {                
                System.out.println("Debe ingresar un numero entero Válido:");
                senteros = scn.nextLine();
            }
            n_enteros = Integer.parseInt(senteros);
            array_enteros[i] = n_enteros; 
        }
        System.out.println("Array original: " + Arrays.toString(array_enteros));
        
        Arrays.sort(array_enteros);
        
        System.out.println("Array ordenado: " + Arrays.toString(array_enteros) );
        
    }
}
