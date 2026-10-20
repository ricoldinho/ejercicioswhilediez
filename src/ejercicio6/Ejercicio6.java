package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;
        int numero;

        do {
            System.out.println("Introduce un número");
            numero = teclado.nextInt();
            acumulador = acumulador + numero;
        }while(numero != 0);

        System.out.println("La suma es: " + acumulador);
    }
}
