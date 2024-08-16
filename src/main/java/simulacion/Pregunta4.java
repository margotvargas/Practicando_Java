package simulacion;

public class Pregunta4 {
    public static void main(String[] args) {

        int num[] = {10, 2, 1, 30};
        int i;
        int temp; // Variable temporal para intercambiar valores

        // Este bucle externo controla el número de pasadas que haremos sobre el arreglo.
        // Necesitamos hacer num.length - 1 pasadas para asegurar que el arreglo esté completamente ordenado.
        for(int j = 0; j < num.length - 1; j++) {
            // Este bucle interno realiza la comparación e intercambio de elementos adyacentes.
            // Recorre el arreglo desde el inicio hasta el penúltimo elemento.
            // En cada pasada, el mayor valor "burbujea" hacia el final del arreglo.
            for (i = 0; i < num.length - 1; i++) {
                // Si el valor actual es menor que el valor siguiente, entonces intercambiamos los valores.
                // Este if asegura que estamos ordenando en orden descendente (mayor a menor).
                if (num[i] < num[i + 1]) {
                    // Guardamos el valor de num[i] en la variable temporal.
                    temp = num[i];
                    // Asignamos a num[i] el valor de num[i + 1].
                    num[i] = num[i + 1];
                    // Asignamos a num[i + 1] el valor temporal que guardamos antes, completando el intercambio.
                    num[i + 1] = temp;
                }
            }
            // Al finalizar cada iteración del bucle interno, el mayor de los valores sin ordenar
            // habrá llegado a su posición correcta al final del arreglo.
        }

        // Imprimimos el primer y el último elemento del arreglo ordenado.
        // Después de ordenar, num[0] será el número mayor y num[num.length-1] será el menor.
        System.out.println(num[0] + " & " + num[num.length - 1]);

    }
}
