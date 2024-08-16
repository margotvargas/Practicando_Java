package simulacion;
import java.util.Scanner;
//Escriba un programa que realice lo siguiente:
//Muestre el siguiente menú informativo al usuario:
//Marque 1: Para Consultar Saldo
//Marque 2: Para Recargar Saldo
//Marque 3: Para Iniciar Sesión
//Marque 4: Para Salir
//Si el usuario escoge la opción 2, debe pedir un monto (validar que sea un número y mayor que 0). Luego, debe mostrar el nuevo saldo, suponiendo que el saldo inicial es 100.
//Nota: Utilice try/catch y parseInt para las validaciones.

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputeleccion;
        int recarga = 100;
        int montorecarga = 0;

        // Menú de opciones
        System.out.println("Marque 1: Para Consultar Saldo");
        System.out.println("Marque 2: Para Recargar Saldo");
        System.out.println("Marque 3: Para Iniciar Sesión");
        System.out.println("Marque 4: Para Salir");
        System.out.print("Introduce la opción elegida: ");
        inputeleccion = scanner.nextInt();

        // Si elige la opción 2, proceder con la recarga de saldo

        if (inputeleccion == 2){
            System.out.println("Ingrese el monto a recargar: ");
            try {
                montorecarga = scanner.nextInt();

                if (montorecarga > 0) {
                    System.out.println("Tu nuevo saldo es :" + (montorecarga + recarga));
                } else {
                    System.out.println("Debe ingresar un monto mayor a 0");
                }
            }catch (Exception e){
                System.out.println("Error: debe ingresar un número válido.");
            }

        } else{
            //mensaje para opciones no validas
            System.out.println("Opcion no válida");
        }
        scanner.close();
    }
}
