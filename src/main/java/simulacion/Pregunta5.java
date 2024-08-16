package simulacion;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Pregunta5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputeleccion;

        // Solicitar un número impar mayor a 2
        System.out.println("Marque 1: Para Consultar Saldo");
        System.out.println("Marque 2: Para Recargar Saldo");
        System.out.println("Marque 3: Para Iniciar Sesión");
        System.out.println("Marque 4: Para Salir");
        System.out.print("Introduce la opción elegida: ");
        inputeleccion = scanner.nextInt();


        // Si elige la opción 3, proceder con la solicitud del DNI y clave

        if (inputeleccion == 3 ) {
            try{
                //Solicito el DNI
                System.out.println("Ingrese su DNI: ");
                String inputDni = scanner.next();//Lee el DNI como string

                // Verificar si la entrada es un número
                int dni = Integer.parseInt(inputDni); // Intentar convertir a número
                // DNI válido, continuar con la solicitud de clave

                System.out.println("Ingrese su clave: ");
                String inputClave = scanner.next(); // Leer clave como String

                // Verificar si la clave es un número
                int clave = Integer.parseInt(inputClave); // Intentar convertir a número

                // Validar si la clave coincide con "1930"
                if (clave == 1930) {
                    System.out.println("Bienvenida al sistema!!!");
                } else {
                    System.out.println("Clave incorrecta.");
                }

            } catch (NumberFormatException e){
                // Si el DNI o la clave no son números, capturar la excepción y mostrar un mensaje de error
                System.out.println("Error: Ingrese solo números para el DNI y la clave.");
            }
        } else {
            System.out.println("Opción no válida. Ingrese una opción entre 1 y 4.");
        }

        scanner.close();
    }
}
