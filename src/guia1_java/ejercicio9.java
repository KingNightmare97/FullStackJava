
package guia1_java;

import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*
        A partir de una cantidad de pesos que el usuario ingresa a traves del
        teclado se debe obtener su equivalente en dolares, en euros, en
        guaranies y en reales. Para este ejercicio se consideran las siguientes
        tasas: 
        
        1 dolar = 231,68 pesos
        1 euro = 250,69 pesos
        1 peso = 31,00 guaran�es
        1 real = 46,81 pesos
        
        */
        
        System.out.println("Ingrese una cantidad de pesos (ejemplo: 250.00 - 183.47) ");
        // lo escaneo en formato string para luego hacer una verificacion
        String spesos = scn.nextLine();
        
        //verifico que ingrese solo numeros y en un formato esperado
        while (!spesos.matches("\\d{1,}\\.\\d{2}")) {            
            System.out.println("Ingrese una cantidad de pesos V�lido (ejemplo: 24.77 - 250.00 - 183.47) ");
            spesos = scn.nextLine();
        }
        
        double pesos_ingresados = Double.parseDouble(spesos);

        /* -------------------------------
        La conversión a guaraníes está mal
        
        ----------------------------------
        
        ? Correccion hecha.
        ------------------------------- */
        double dolar = (pesos_ingresados / 231.68);
        double euro = (pesos_ingresados / 250.69);
        double guaranies = (pesos_ingresados * 31.00);
        double reales = (pesos_ingresados / 46.81);
        System.out.println("Equivalente en Dolares: " + String.format("%.2f",dolar));
        System.out.println("Equivalente en Euros: " + String.format("%.2f",euro));
        System.out.println("Equivalente en Guaran�es: " + String.format("%.2f",guaranies));
        System.out.println("Equivalente en Reales: " + String.format("%.2f",reales));
    }
}
