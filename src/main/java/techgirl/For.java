package techgirl;

public class For {
    public static void main(String[] args){
        int inicio;
        // Inicio del bucle 'for'.
        // El bucle 'for' se compone de tres partes:
        // 1. Inicialización: 'inicio = 0' (establece el valor inicial de la variable 'inicio')
        // 2. Condición: 'inicio <= 10' (el bucle se ejecuta mientras esta condición sea verdadera)
        // 3. Incremento: 'inicio = inicio + 1' (aumenta el valor de 'inicio' en 1 después de cada iteración)
        for (inicio = 0; inicio <= 10; inicio = inicio +1)
            // El cuerpo del bucle: se ejecuta en cada iteración.
            // Imprime el valor actual de la variable 'inicio' en la consola.
            System.out.println("El número es: " + inicio);
    }
}
