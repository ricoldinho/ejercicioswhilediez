package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        boolean huboNegativo = false;

        while(contador < 5){
            System.out.println("Introduce un número entero");
            int numero = teclado.nextInt();
            if(numero < 0){
                huboNegativo = true;
            }
            contador++;
        }
        System.out.println("Números negativos detectados: " + huboNegativo);
    }
}
