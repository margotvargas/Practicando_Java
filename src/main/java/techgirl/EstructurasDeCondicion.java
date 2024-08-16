package techgirl;

public class EstructurasDeCondicion {
    public static void main(String[] args) {
        //EJEMPLO 1
        //DECLARACIÓN
        int numeroA;
        int numeroB;
        /*
        //INICIALIZACIÓN
        numeroA = 2;
        numeroB = 5;

        //OPERADORES LÓGICOS
        System.out.println("Número A es igual a Número B");
        System.out.println(numeroA == numeroB);

        System.out.println("Número A es distinto a Número B");
        System.out.println(numeroA != numeroB);

        System.out.println("Número A es menor a Número B");
        System.out.println(numeroA < numeroB);

        System.out.println("Número A es mayor a Número B");
        System.out.println(numeroA > numeroB);

        System.out.println("Número A no es igual a Número B");
        System.out.println(numeroA != numeroB);

        //EJEMPLO 2
        //INICIALIZACIÓN
        numeroA = 10;
        numeroB = 5;

        //SENTENCIA IF y ELSE
        if (numeroA == numeroB) { // Es igual a
            System.out.println("Realizo SUMA:");  // Resultado es falso
            System.out.println(numeroA + numeroB);
        } else {
            System.out.println("Realizo RESTA:"); // Resultado es verdadero
            System.out.println(numeroA - numeroB);
        }
        //EJEMPLO 3
        //EJEMPLO DE SENTENCIAS ANIDADAS
        // DECLARACIÓN
        int temperatura;
        String tiempo;

        //INICIALIZACIÓN
        temperatura = 18;
        tiempo = "noche";


        if (tiempo == "noche") {
            if (temperatura >= 26) {
                System.out.println("Es un día caluroso");
            } else if (temperatura >= 22 && temperatura <= 25) {
                System.out.println("Es un día cálido");
            } else if (temperatura >= 17 && temperatura <= 21) {
                System.out.println("Es un día frío");
            } else {
                System.out.println("La temperatura no coincide");
            }
        } else {
            System.out.println("Es de día");
        }

        //EJEMPLO4
        //DECLARAR LA VARIABLE “DIVISION1” CUYO VALOR SEA IGUAL A LA DIVISIÓN ENTRE LA VARIABLE
        // “C” Y “B” RESPECTIVAMENTE; Y VALIDAR SI EL RESULTADO ES UN NUMERO POSITIVO, NEGATIVO,
        // IGUAL A CERO O DIVISIÓN NO POSIBLE.
        // Declaración de variables
        double c = -100;  // Puedes asignar cualquier valor a C
        double b = 5;   // Puedes asignar cualquier valor a B
        double division1;

        // Validación para evitar división por cero
        if (b != 0) {
            division1 = c / b;
            System.out.println("El resultado de la división es: " + division1);

            // Validación del resultado de la división
            if (division1 > 0) {
                System.out.println("El resultado es un número positivo.");
            } else if (division1 < 0) {
                System.out.println("El resultado es un número negativo.");
            } else {
                System.out.println("El resultado es igual a cero.");
            }
        } else {
            System.out.println("División no posible. El divisor (B) es igual a cero.");
        }

        //EJEMPLO 5
        //SENTENCIA SWITCH

        //DECLARACIÓN
        int mes;
        //INICIALIZACIÓN
        mes = 3;

        switch (mes) { // Condición de selección
            case 1:
                System.out.println("EL mes ENERO se encuentra REGISTRADO");
                break;
            case 3:
                System.out.println("EL mes MARZO se encuentra REGISTRADO");
                break;
            case 8:
                System.out.println("EL mes AGOSTO se encuentra REGISTRADO");
                break;
            case 10:
                System.out.println("EL mes OCTUBRE se encuentra REGISTRADO");
                break;
            case 12:
                System.out.println("EL mes DICIEMBRE se encuentra REGISTRADO");
                break;
            default:
                System.out.println("EL mes no se encuentra registrado");
        }
        */
        //EJEMPLO 6
        int opcion;

        opcion = 1;
        switch (opcion){
            case 0:
                System.out.println("Haz marcado la opcion Llamar");
                break;
            case 1:
                System.out.println("Haz marcado la opcion Enviar Mensaje");
                break;
            case 2:
                System.out.println("Haz marcado la opcion Apagar");
                break;
            case 3:
                System.out.println("Haz marcado la opcion Reiniciar");
                break;
            case 4:
                System.out.println("Haz marcado la opcion Autodestruir");
                break;
        }








    }

}
