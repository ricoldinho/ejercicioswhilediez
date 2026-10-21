package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "codigo";
        int contador = 0;
        String palabra;
        boolean acierto = false;
        do{
            System.out.println("Introduce la palabra a adivinar");
            palabra = sc.nextLine();
            contador++;
            if(palabra.equalsIgnoreCase(palabraSecreta)){
                acierto = true;
            }
                                //acierto == false
        }while(contador != 3 && !acierto);
        //acierto == true
        if(acierto){
            System.out.println("Has acertado la palabra secreta");
        }else {
            System.out.println("Has perdido");
        }
    }
}
