package practicando;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println("Los números pares en el arreglo son:");

        // Bucle for que recorre todos los elementos del arreglo 'numeros'
        for (int i=0; i < numeros.length; i++)

        {
            if (numeros[i] % 2 == 0){  // Un número es par si el resto de la división entre 2 es igual a 0
                System.out.println(numeros[i]);
            }
        }
    }
}
