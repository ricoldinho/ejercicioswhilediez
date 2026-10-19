package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cuenta = 1;
        int numMultiplos = 0;

        while(cuenta <= 50){
            System.out.println(cuenta);
            if(cuenta % 7 == 0) {
                numMultiplos++;
            }
            cuenta++;

        }
        System.out.println("Hay un total de :" + numMultiplos + "múltiplos de 7");
    }
}
