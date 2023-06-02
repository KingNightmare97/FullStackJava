
package guia2_practica;

import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*
        Escribir un programa que lea una palabra por teclado y determine si
        es un pal�ndromo.
        */
        
        System.out.println("Ingrese una palabra: ");
        String spalabra = scn.nextLine();
        
        // paso la palabra a minuscula y remplazo las vocales con acento a sin acento
        
        spalabra = spalabra.toLowerCase().replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o").replace("�", "u");
        
        // doy vuelta la palabra
        String reversa = new StringBuilder(spalabra).reverse().toString();
        
        if (reversa.equals(spalabra)) {
            System.out.println("la palabra ingresada es un pal�ndromo");
        } else {
            System.out.println("la palabra ingresada no es un pal�ndromo");
        }
    }
    
}
