package techgirl;

public class While {
    public static void main(String[] args){
        /*
        int inicio = 70;
        // Inicio del bucle 'while'.
        // Este bucle continuará ejecutándose mientras la condición (inicio <= 10) sea verdadera.
        while (inicio <= 90){
            // Imprime en la consola el valor actual de la variable 'inicio'.
            System.out.println("El número es: " + inicio);
            // Incrementa el valor de la variable 'inicio' en 1 después de cada iteración del bucle.
            inicio = inicio + 1;
        }
        // El bucle termina cuando la condición (inicio <= 10) deja de ser verdadera.
        */

        //EJERCICIO 2
        // Caso de prueba 1
        // Declaración e inicialización de dos variables flotantes (decimales)
        float v1 = 50;
        float v2 = 3;

        System.out.println("Caso de prueba 1:");

        // Inicio del bucle while
        // Este bucle continuará ejecutándose mientras el valor de v1 sea mayor que 1
        while (v1 > 1) {
            // Divide el valor actual de v1 por v2 y asigna el resultado nuevamente a v1
            v1 = v1 / v2;
            // Imprime el valor actual de v1 después de la división
            System.out.println(v1);
        }


    }
}
