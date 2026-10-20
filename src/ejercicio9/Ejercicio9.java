package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "codigo";
        int contador = 0;
        String palabra;

        do{
            System.out.println("Introduce la palabra a adivinar");
            palabra = sc.nextLine();
            contador++;
        }while(contador != 3 && !palabraSecreta.equalsIgnoreCase(palabra));

      
    }
}
