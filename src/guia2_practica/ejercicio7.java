
package guia2_practica;
//import java.util.Arrays;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        // https://drive.google.com/file/d/1CCf2KdrRXCi7ABqfEFt53Xf5-CIzVuWn/view
        Scanner scn = new Scanner(System.in);
        
        String sherbivoro,smamifero ,sdomestico;
        String [][] tabla_animal = {{"Alce", "si","si","no"}
                ,{"Caballo", "si","si","si"}
                ,{"Caracol", "si","no","no"}
                ,{"C�ndor", "no","no","no"}
                ,{"Gato", "no","si","si"}
                ,{"Le�n", "no","si","no"}
                ,{"Pit�n", "no","no","si"}
                ,{"Tortuga", "si","no","si"}};


        System.out.println("�Su animal es Herb�voro? Escriba si/no");
        sherbivoro = scn.nextLine();

        sherbivoro = sherbivoro.toLowerCase().replace("�", "i").replace("�", "o");
            
        System.out.println("�Su animal es Mam�fero? Escriba si/no");
        smamifero = scn.nextLine();

        smamifero = smamifero.toLowerCase().replace("�", "i").replace("�", "o");
            
        System.out.println("�Su animal es Domestico? Escriba si/no");
        sdomestico = scn.nextLine();

        sdomestico = sdomestico.toLowerCase().replace("�", "i").replace("�", "o");
        
        
        for (String[] tabla_animal1 : tabla_animal) {

            if ((tabla_animal1[1].equals(sherbivoro)) && (tabla_animal1[2].equals(smamifero)) && (tabla_animal1[3].equals(sdomestico))) {
                System.out.println("Su animal es un/a: " + tabla_animal1[0]);
            }
        }
    
    }
}
