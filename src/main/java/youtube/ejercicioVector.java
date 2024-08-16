package youtube;
import java.util.Scanner;
//ejercicio que genera un vector ingresando por teclado los valores y
// cuenta cuantas veces hay en el vector el numero 3
public class ejercicioVector {
    public static void main(String[] args) {
        int vector [] = new int [15];

        Scanner teclado =new Scanner(System.in);
        //Cargando nuestro vector
        for (int i = 0; i < 15; i++){
            System.out.println("Ingrese unnumero para el vector: ");
            vector[i] = teclado.nextInt();
        }
        //recorrer y contar cuantos numeros 3 hay
        int cont = 0;

        for (int i = 0; i < 15; i++){
            if (vector[i] == 3) {
                cont = cont + 1;
            }
        }
        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
    }
}
