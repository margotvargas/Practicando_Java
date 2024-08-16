package techgirl;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        /* EJEMPLO 1
        int x = 0;
        // Inicio del bucle 'do-while'.
        // Este bucle siempre ejecuta el bloque de código al menos una vez,
        // antes de verificar la condición al final.
        do {
            // Imprime el valor actual de la variable 'x' en la consola.
            System.out.println("El valor de x: " + x);
            // Incrementa el valor de 'x' en 1 después de cada iteración del bucle.
            x = x + 1;
        }
        // La condición se verifica después de ejecutar el bloque de código.
        // Si 'x' es menor que 10, el bucle se repite.
        while (x < 10);

         */
        //EJEMPLO 2
        // Declaramos la contraseña correcta
        int password = 4567;
        int inputPassword;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle que se repetirá hasta que el usuario ingrese la contraseña correcta
        do {
            // Solicitar al usuario que ingrese la contraseña
            System.out.print("Ingrese su contraseña numérica: ");

            // Leer la entrada del usuario como un número entero
            inputPassword = scanner.nextInt();

            // Verificar si la contraseña es incorrecta
            if (inputPassword != password) {
                // Imprimir "Inválido" si la contraseña es incorrecta
                System.out.println("Inválido");
            }
        } while (inputPassword != password);  // Repetir el bucle mientras la contraseña sea incorrecta

        // Imprimir "Válido" cuando la contraseña correcta sea ingresada
        System.out.println("Válido");

        // Cerrar el escáner
        scanner.close();


    }
}
