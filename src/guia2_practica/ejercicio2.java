
package guia2_practica;

import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*
        Escribir un programa que lea una palabra por teclado y determine si
        es un palíndromo.
        */
        
        System.out.println("Ingrese una palabra: ");
        String spalabra = scn.nextLine();
        
        // paso la palabra a minuscula y remplazo las vocales con acento a sin acento
        
        spalabra = spalabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        
        // doy vuelta la palabra
        String reversa = new StringBuilder(spalabra).reverse().toString();
        
        if (reversa.equals(spalabra)) {
            System.out.println("la palabra ingresada es un palíndromo");
        } else {
            System.out.println("la palabra ingresada no es un palíndromo");
        }
    }
    
}
