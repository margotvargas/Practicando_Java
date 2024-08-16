package practicando;

import java.util.Scanner;

//Pedir dos palabras por teclado, indicar si son iguales.
public class Ejercicio6 {
    public static void main(String[] args) {
        String inputPalabra1;
        String inputPalabra2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primera palabra: ");
        inputPalabra1 = scanner.nextLine(); // Leer la entrada

        System.out.print("Ingrese segunda palabra: ");
        inputPalabra2 = scanner.nextLine(); // Leer la entrada

        if (inputPalabra1.equals(inputPalabra2)){ //el == solo se usa en numeros en string se usa equals.
            System.out.println("Ambas palabras " + inputPalabra1 + " son iguales");
        }

        else {
            System.out.println("Ambas palabras no son iguales");
        }
    }
}
