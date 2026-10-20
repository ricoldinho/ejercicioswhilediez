package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        double calificacion = 0;
        double sumaCalificaciones = 0;
        double parada = -1.0;

        while(calificacion != parada){
            System.out.println("Introduce un número");
            calificacion = teclado.nextDouble();
            if(calificacion != parada){
                sumaCalificaciones = sumaCalificaciones + calificacion;
                contador++;
            }
        }
        System.out.println("La media es: " + (sumaCalificaciones / contador));
    }
}
