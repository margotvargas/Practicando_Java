package techgirl;

public class Arreglos {
    public static void main(String[] args) {
        /*
        //EJEMPLO 1
        int Arreglo[] = {1,2,5,7,8,10,20};
        for (int i=0; i < Arreglo.length; i++)
        {
            System.out.println(Arreglo[i]);
        }

        //EJEMPLO2
        int arreglo1[] = {10, 12, 15, 20};
        int arreglo2[] = {15, 10};
        int arreglo3[] = {20, 0, 15, 13, 17};
        int arreglo4[] = {0, 0, 15, 13, 10};

        // Caso de prueba 1
        int suma1 = 0;
        for (int nota : arreglo1) {
            suma1 += nota;
        }
        double promedio1 = (double) suma1 / arreglo1.length;
        System.out.println("El promedio es " + promedio1);

        // Caso de prueba 2
        int suma2 = 0;
        for (int nota : arreglo2) {
            suma2 += nota;
        }
        double promedio2 = (double) suma2 / arreglo2.length;
        System.out.println("El promedio es " + promedio2);

        // Caso de prueba 3
        int suma3 = 0;
        for (int nota : arreglo3) {
            suma3 += nota;
        }
        double promedio3 = (double) suma3 / arreglo3.length;
        System.out.println("El promedio es " + promedio3);

        // Caso de prueba 4
        int suma4 = 0;
        for (int nota : arreglo4) {
            suma4 += nota;
        }
        double promedio4 = (double) suma4 / arreglo4.length;
        System.out.println("El promedio es " + promedio4);
        */
        //EJEMPLO 3

        String[] apellidos = new String[5]; //Aqui creamos el arreglo con [] y le asignadmos su valor que sera de 5 campos
        apellidos[0] = "Vargas";
        apellidos[1] = "Pezua";
        apellidos[2] = "Otoya";
        apellidos[3] = "Ramirez";
        apellidos[4] = "Soto";
        //en vez de imprimir uno por uno creamos un for     System.out.println(apellidos[0]);
        for (int i=0; i < apellidos.length; i++){
            System.out.println(apellidos[i]);
        }

    }
}
