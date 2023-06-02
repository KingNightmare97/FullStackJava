
package guia1_java;

import java.util.Scanner;
public class Ejercicio6 {
    
    static void sacarporcentaje(double precio_fun, double descuento){
        System.out.println("El importe a Pagar es: " + String.format("%.2f",precio_fun - (precio_fun*descuento)));
        
        System.out.println("El importe descontado es: " + String.format("%.2f",(precio_fun * descuento)));
    }
    
    public static void main(String[] args) {
        /*
        
        Pedir al usuario que ingrese el precio de un producto y el porcentaje
        de descuento. A continuación mostrar por pantalla el importe
        descontado y el importe a pagar.
        
        */
        
        // lo escaneo en formato string para luego hacer una verificacion
            
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        String precio = scn.nextLine();
        
        System.out.println("Ingrese el porcentaje de descuento:");
        String descuento = scn.nextLine();
        //verifico que ingrese solo numeros y en un formato esperado
        while (!precio.matches("\\d{1,}\\.\\d{2}") || !descuento.matches("\\d{1,2}")) {
            while (!precio.matches("\\d{1,}\\.\\d{2}")) {                
                System.out.println("Debe ingresar un Precio Válido:");
                precio = scn.nextLine();
            }
            while (!descuento.matches("\\d{1,2}")) {                
                System.out.println("Debe ingresar un Descuento Válido:");
                descuento = scn.nextLine();
            }
        }
        // convierto las 2 variables string a double
        double num1 = Double.parseDouble(precio);
        double num2 = Double.parseDouble(descuento);
        // paso el num2 a porcentaje en decimales ej= 0.10, 0.55, etc
        num2 = num2 / 100;
        // llamo a la funcion y le paso los parametros
        sacarporcentaje(num1,num2);
        
    }
    
    
}
