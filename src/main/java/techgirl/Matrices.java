package techgirl;

public class Matrices {
    public static void main(String[] args) {
        //Declaración
        int matriz [][] = new int [3][3];

        //Asignación (Manual)
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 35;
        matriz[1][1] = 33;
        matriz[1][2] = 71;
        matriz[2][0] = 446;
        matriz[2][1] = 228;
        matriz[2][2] = 24;

        //Recorrido
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                // Imprime la posición y el valor correspondiente en la matriz
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
    }
}

