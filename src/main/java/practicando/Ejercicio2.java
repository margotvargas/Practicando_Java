package practicando;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Asignar un valor a la variable número
        int numero = 17; // Cambia este valor para probar con diferentes números

        // Verificar si el número es primo
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        // Verificar divisibilidad desde 2 hasta el número anterior a numero
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; // No es primo si se encuentra un divisor
            }
        }
        return true; // Es primo si no se encontraron divisores
    }

}
