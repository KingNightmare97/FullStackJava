
package guia1_java;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Pedir al usuario que ingrese el valor del radio de una circunferencia.
        Calcular y mostrar por pantalla el área y el perímetro. Recordá que el
        área y el perímetro se calculan con las siguientes fórmulas:
        
        area = PI × radio2
        perimetro = 2 × PI × radio
        
        Tip: para este ejercicio se puede usar la constante matemática PI ( ) ?
        disponible en la clase Math.
        */
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese el Valor del Radio de una Circunferencia:");
        System.out.println("formatos esperados - x.x , xx.x");
        // lo escaneo en formato string para luego hacer una verificacion
            
        String radio = scn.nextLine();
        //verifico que ingrese solo numeros y en un formato esperado
        while (!radio.matches("\\d{1,2}\\.\\d{1}")) {            
            System.out.println("Ingrese el Valor del Radio de una Circunferencia Válido:");
            System.out.println("Recuerde los formatos esperados - x.x , xx.x");
            radio = scn.nextLine();
        }
        // convierto el string a double
        double radio_conver = Double.parseDouble(radio);
        
        double area = Math.PI * (Math.pow(radio_conver, 2));
        double perimetro = 2 * Math.PI * radio_conver;
        
        System.out.println("El resultado del area es: " + String.format("%.2f", area));
        System.out.println("El resultado del perimetro es: " + String.format("%.2f", perimetro));
        
    }
}
