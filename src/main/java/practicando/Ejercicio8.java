package practicando;
import java.util.Scanner;

//Crear un arreglo con 20 números y pedir a un usuario de ingresar 1 número.
//Si el número está en el arreglo, mostrar el resultado “Encontrado !!!”
//Si el número NO está en el arreglo, mostrar el resultado “No se ha encontrado…”

public class Ejercicio8 {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int inputNumero = scanner.nextInt(); // Leer la entrada

        // Recorrer el arreglo para verificar si el número ingresado está presente
        for (int i = 0; i < numeros.length; i++) {
            if (inputNumero == numeros[i]) { // Comparar el número ingresado con el valor en el arreglo
                System.out.println("Encontrado!!!"); // Número encontrado
                return; // Terminar la ejecución del método main
            }
        }
        // Si se recorre todo el arreglo y no se encuentra el número, se imprime el siguiente mensaje
        System.out.println("No se ha encontrado...");
    }
}