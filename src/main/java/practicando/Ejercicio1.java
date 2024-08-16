package practicando;
//Ejercicio 1 :
//Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

public class Ejercicio1 {
    public static void main(String[] args) {
        int number1 = 18;
        int number2 = 10;
        System.out.println("La suma de " + number1 + " y " + number2 + " es: " + (number1 + number2));
        System.out.println("La resta de " + number1 + " y " + number2 + " es: " + (number1 - number2));
        System.out.println("La multiplicación de " + number1 + " y " + number2 + " es: " + (number1 * number2));
        System.out.println("La división de " + number1 + " y " + number2 + " es: " + (number1/number2));
        System.out.println("El resto de la división de " + number1 + " y " + number2 + " es: " + (number1%number2));
    }
}
