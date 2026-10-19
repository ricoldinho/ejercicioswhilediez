package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do{
            System.out.println("Hola introduce un caracter (s/n)");
            respuesta = sc.nextLine();
        }while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

    }
}
