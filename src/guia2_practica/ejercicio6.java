
package guia2_practica;


public class ejercicio6 {
    /*
    Escribir un algoritmo que imprima el listado de los n�meros primos
    menores que 200. Aclaraci�n: el n�mero 1 no es primo.
    
    Tip: un n�mero es primo si es divisible �nicamente por 1 y por s� mismo.
    Por ejemplo, el 7 es primo porque s�lo es divisible por 1 y por 7.
    El 6 no es primo porque es divisible por 1, por 2, por 3 y por 6.
    */
    public static boolean esPrimo(int numero){
    int contador = 2;
    boolean primo=true;
    while ((primo) && (contador!=numero)){
      if (numero % contador == 0)
            primo = false;
      contador++;
    }
    return primo;
}
    
    public static void main(String[] args) {    
    int max = 200;
        
    for(int x = 2; x <= max; x++){
        if(esPrimo(x)){
            System.out.println(x+" es primo");
        }
    }
       
}
}
