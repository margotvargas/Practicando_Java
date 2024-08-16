package simulacion;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar un número par mayor a 4
        do {
            System.out.print("Introduce un número par mayor que 4: ");
            n = scanner.nextInt();
        } while (n <= 4 || n % 2 != 0);

        // Imprimir la primera fila de estrellas
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // Salto de línea

        // Imprimir las filas intermedias
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*"); // Primera estrella
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" "); // Espacios en el medio
            }
            System.out.println("*"); // Última estrella
        }

        // Imprimir la última fila de estrellas
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // Salto de línea final

        scanner.close();
    }
}
