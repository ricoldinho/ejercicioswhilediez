package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int acumulador = 0;
        boolean esPar = false;

        while(numero >= 0){
            System.out.println("Introduzca un número");
            numero = sc.nextInt();
            if(numero >= 0){
                contador++;
                //acumulador += numero;
                acumulador = acumulador + numero;
                if(numero % 2 == 0){
                    esPar = true;
                }
            }
        }
        System.out.println("Total de números introducidos: " + contador);
        System.out.println("Total de la suma acumulada: " + acumulador);
        System.out.println("¿Hubo algún par? " + esPar);
    }
}
