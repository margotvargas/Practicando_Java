package simulacion;
import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputnumber;

        // Solicitar un número impar mayor a 2
        System.out.print("Introduce un número impar mayor a 2: ");
        inputnumber = scanner.nextInt();

        // Usar un while para asegurarse de que el número es impar y mayor a 2
        while (inputnumber <= 2 || inputnumber % 2 == 0) {
            System.out.print("Introduce un número válido impar mayor a 2: ");
            inputnumber = scanner.nextInt();
        }

        // Imprimir la primera mitad del patrón
        for (int i = 1; i <= inputnumber; i++) {
            // Imprimir "i" veces el símbolo "#"
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // Imprimir un salto de línea
            System.out.println();
        }

        // Imprimir la segunda mitad del patrón
        for (int i = inputnumber - 1; i >= 1; i--) {
            // Imprimir "i" veces el símbolo "#"
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // Imprimir un salto de línea
            System.out.println();
        }

        scanner.close();
    }
}
