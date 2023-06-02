
package guia2_practica;

import java.util.Arrays;
public class ejercicio3 {
    public static void main(String[] args) {

        int array_enteros[] = {8, 99, 55, 20, 14, 6, 2, 77, 35, 12};
        
        System.out.println("Array original: " + Arrays.toString(array_enteros));
        
        Arrays.sort(array_enteros);
        
        System.out.println("Array ordenado: " + Arrays.toString(array_enteros) );
        
    }
}
