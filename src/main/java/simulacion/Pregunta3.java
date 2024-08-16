package simulacion;

public class Pregunta3 {
    public static void main(String[] args) {
        int lista[] = {6, 9, -8, 23, 3, 100, 3};

        int nNum1 = lista[0]; // Inicializa nNum1 con el primer valor del array, 6
        int nNum2 = lista[0]; // Inicializa nNum2 con el primer valor del array, 6

        for(int i = 1; i < lista.length; i++) {
            if(lista[i] < nNum1) {
                nNum1 = lista[i]; // Si el valor actual es menor que nNum1, se actualiza nNum1
            }
            if(lista[i] > nNum2) {
                nNum2 = lista[i]; // Si el valor actual es mayor que nNum2, se actualiza nNum2
            }
        }

        System.out.println("nNum1: " + nNum1 + ", nNum2: " + nNum2);
    }
}
