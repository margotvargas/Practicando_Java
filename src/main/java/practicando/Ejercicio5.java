package practicando;
import java.util.Scanner;
//Pedir 2 palabras por teclado al usuario, e mostrar en la consola cual de las 2 tiene la mayor longitud, e mostrar su longitud .

public class Ejercicio5 {
    public static void main(String[] args) {
        String inputPalabra1;
        String inputPalabra2;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primera palabra: ");
        inputPalabra1 = scanner.nextLine(); // Leer la entrada
        //scanner.nextLine();

        System.out.print("Ingrese segunda palabra: ");
        inputPalabra2 = scanner.nextLine();

        int longitudPalabra1;
        int longitudPalabra2;

        longitudPalabra1 = inputPalabra1.length();
        longitudPalabra2 = inputPalabra2.length();

        if (longitudPalabra1 > longitudPalabra2){
            System.out.println("La palabra más grande es " + inputPalabra1 + " de longitud " + longitudPalabra1);
            }
        else if (longitudPalabra1 < longitudPalabra2) {
            System.out.println("La palabra más grande es " + inputPalabra2 + " de longitud " + longitudPalabra2);
        }
        else {
            System.out.println("Ambas palabras tienen la misma longitud: " + longitudPalabra2);
        }

    }
}
