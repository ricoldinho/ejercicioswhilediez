package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;

        while(suma <= 100){
            suma = suma + numero;
            System.out.println("Operación: " + suma + " + " + numero);
            numero++;
        }
        System.out.println("La suman final es: " + suma);
        System.out.println("El último número sumado es: " + (numero - 1) );
    }

}
