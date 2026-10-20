package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave = 1234;
        int intentos = 0;
        int claveIntroducida;

        do {
            System.out.println("Introduce la clave PIN: ");
            claveIntroducida = sc.nextInt();
            intentos++;
        }while(clave != claveIntroducida);

        System.out.println("Acceso concedido en: " + intentos + " intentos");


    }
}
