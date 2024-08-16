package simulacion;

public class Pregunta1 {
    public static void main(String[] args) {

        int listasNotas[] = {12, 10, 10, 9};

        // Declaración de una variable de tipo double para almacenar la suma y posteriormente el promedio
        double promedio = 0;

        // Bucle for para recorrer todos los elementos del arreglo listasNotas
        for (int i = 0; i < listasNotas.length; i++) {
            // Suma el valor actual del arreglo a la variable promedio
            promedio = promedio + listasNotas[i];
        }
        // Divide la suma total de los elementos del arreglo entre la cantidad de elementos para calcular el promedio
        promedio = promedio / listasNotas.length;
        System.out.println(promedio);

    }
}
