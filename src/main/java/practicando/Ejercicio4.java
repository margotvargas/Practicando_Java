package practicando;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int inputNumber1;
        int inputNumber2;
        String inputOperador;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer numero
        System.out.print("Ingrese su primer número: ");
        inputNumber1 = scanner.nextInt(); //Lee la entrada del primer numero

        // Solicitar al usuario que ingrese el segundo numero
        System.out.print("Ingrese su segundo número: ");
        inputNumber2 = scanner.nextInt(); // Leer la entrada del segundo número

        scanner.nextLine();

        // Solicitar al usuario que ingrese el operador
        System.out.print("Ingrese el operador + * - / de su elección: ");
        inputOperador = scanner.nextLine(); // Leer la entrada del segundo número

        //Variable para almacenar el resultado
        int resultado = 0;

        switch (inputOperador){
            case "+":
                resultado = inputNumber1 + inputNumber2;
                break;
            case "-":
                resultado = inputNumber1 - inputNumber2;
                break;
            case "*":
                resultado = inputNumber1 * inputNumber2;
                break;
            case "/":
                resultado = inputNumber1 / inputNumber2;
                break;
            default:
                System.out.println("Operador no válido.");
                scanner.close();
                return;
            }

    // Punto adicional: Imprimir el resultado con detalle
    System.out.println("El resultado de " + inputNumber1 + " " + inputOperador + " " + inputNumber2 + " es " + resultado);

    scanner.close();


    }
}
