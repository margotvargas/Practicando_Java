package youtube;
import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {

        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno en TodoCode");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado"; //operador ternario
        System.out.println("La condicion final del alumno es: " + condicionFinal);
    }
}
