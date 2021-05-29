
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programa Main para grafos
 * @author Jose Mariano Reyes 20074
 */


public class Main {
    public static void main (String[] args) {
        //matriz con algoritmo de floyd
        Floyd matriz = new Floyd ();
        //Algoritmo floyd que encuentra el camino más corto
        matriz.CamCorto();
        int selec = 1;
        int opcion;
        Scanner scan = new Scanner(System.in);

        /**
         * Ciclo para las opciones
         */
        while (selec!=4) {
            System.out.println("Bienvenido al programa implementando el algoritmo de Floyd \nLas opciones son las siguientes:");
            System.out.println("1. Calcular distancia entre ciudades");
            System.out.println("2. Ciudad en el centro del grafo");
            System.out.println("3. Modificar grafo");
            System.out.println("4. Finalizar Programa");
            System.out.println("Ingrese una opcion: \n");
            selec = scan.nextInt();

            if (selec==1) {
                matriz.CamCorto();
                System.out.println("\nCiudad de Origen: ");
                String c1 = scan.next();
                System.out.println("Ciudad de Destino: ");
                String c2 = scan.next();

                if (matriz.D.contains(c1)&&matriz.D.contains(c2)) {
                    System.out.println("\nLa distacnia minima es :" + matriz.D.getEdge(c1, c2));
                    if (matriz.D.getEdge(c1, c2)!=10000) {
                        System.out.println("La ruta es" + c1);
                        try {
                            matriz.Intermedios(matriz.D.getIndex(c1), matriz.D.getIndex(c2));
                        } catch (Exception e) {
                            System.out.println("");
                        }
                        System.out.println(","+c2);
                    }
                }
            }

            else if (selec==2) {
                matriz.CentGrafo();
            }

            else if (selec==3) {
                System.out.println("\n1. Fijar interrupción entre ciudades");
                System.out.println("2. Fijar nueva conexión");
                System.out.println("Ingrese una opción: ");
                opcion=scan.nextInt();
                if (opcion==1) {
                    System.out.println("Ciudad de Origen: ");
                    String c1 = scan.next();
                    System.out.println("Ciudad de Destino: ");
                    String c2 = scan.next();
                    if (matriz.D.contains(c1)&&matriz.D.contains(c2)) {
                        matriz.D.addEdge(c1, c2, 10000);
                        try {
                            matriz.lector.Write(c1+" "+c2+"10000");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                if(opcion==2) {
                    System.out.println("\nCiudad de Origen: ");
                    String c1 = scan.next();
                    System.out.println("Ciudad de Destino: ");
                    String c2 = scan.next();
                    System.out.println("Distancia en KM entre las dos ciudades: ");
                    int dist=scan.nextInt();
                    if (matriz.D.contains(c1)&&matriz.D.contains(c2)) {
                        matriz.D.addEdge(c1, c2, dist);
                    }
                    else {
                        matriz.D.add(c1);
                        matriz.D.add(c2);
                        matriz.D.addEdge(c1, c2, dist);
                    }
                    try {
                        matriz.lector.Write(c1 +" "+c2+" "+dist);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                matriz.CamCorto();
            }
        }
        System.out.println("\nHa elegido salir.\nBuen día!!!");
    }
}
