package practicando;

public class Ejercicio3 {
    public static void main(String[] args) {
        int mivariable = 6; // Esta variable es el límite superior hasta donde se hará la suma.
        int suma = 0;// Declaración de la variable "suma" con el valor 0, se usará para acumular la suma de los números.

        for (int i = 1; i <= mivariable; i=i+1) {
            //Bucle "for"  se repite mientras la condición "i <= mivariable" sea verdadera.
            // "int i = 1" inicializa la variable "i" en 1.
            // "i <= mivariable" es la condición que se evalúa en cada iteración; el bucle continúa si es verdadera.
            // "i = i + 1" incrementa el valor de "i" en 1 después de cada iteración.

            suma = suma + i;
            // En cada iteración, se suma el valor actual de "i" a la variable "suma".
            // Es decir, "suma" acumula la suma de todos los valores de "i" desde 1 hasta "mivariable".
        }
        System.out.println("La suma del 1 a " + mivariable + " es: " + suma);

    }
}
