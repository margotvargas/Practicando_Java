package techgirl;

public class Cadenas {
    public static void main(String[] args) {
        // Declarar una cadena y asignarle una frase con al menos 3 palabras
        String frase = "Hola Mundo Feliz";

        // Dividir la frase en palabras usando substring
        String palabra1 = frase.substring(0, 4);   // "Hola"
        String palabra2 = frase.substring(5, 10);  // "Mundo"
        String palabra3 = frase.substring(11, 16); // "Feliz"

        // Obtener la longitud de cada palabra
        int a = palabra1.length(); // 4
        int b = palabra2.length(); // 5
        int c = palabra3.length(); // 5

        // Imprimir cada palabra y su longitud
        System.out.println(palabra1);
        System.out.println(a);

        System.out.println(palabra2);
        System.out.println(b);

        System.out.println(palabra3);
        System.out.println(c);
    }
}

