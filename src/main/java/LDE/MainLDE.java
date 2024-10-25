package LDE;

import java.util.Scanner;

/**
 * Esta clase representa el punto de entrada principal del programa. Se encarga de manejar la entrada del usuario y interactúa con la clase ListaDoblementeEncadenada.
 * @Autor Ana Lucelly Lizcano, Juan Esteban Saavedra, Esteban Salazar Mejía
 * Fecha: 25 de octubre del 2024
 * Licencia: GNU GPE
 */
public class MainLDE {
    public static void main(String[] args) {
        // Crea una nueva instancia de ListaDoblementeEncadenada
        ListaDoblementeEncadenada lista = new ListaDoblementeEncadenada();
        // Crea un nuevo objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese una oración
        System.out.println("Ingrese una oración:");
        String oracion = scanner.nextLine();
        // Inserta la oración en la lista enlazada
        lista.insertarOracion(oracion);

        // Bucle infinito para el menú del usuario
        while (true) {
            System.out.println("\n1. Imprimir oración en orden inverso");
            System.out.println("2. Borrar una palabra");
            System.out.println("3. Imprimir palabra anterior y siguiente");
            System.out.println("4. Salir");

            // Lee la opción del usuario
            int opcion = scanner.nextInt();
            // Consumir el salto de línea
            scanner.nextLine();

            // Switch para manejar las opciones del usuario
            switch (opcion) {
                case 1:
                    // Imprime la oración en orden inverso
                    lista.imprimirOrdenInverso();
                    break;
                case 2:
                    // Pide al usuario que ingrese una palabra para eliminar
                    System.out.print("Ingrese la palabra a borrar: ");
                    // Elimina la palabra especificada de la lista enlazada
                    lista.borrarNodo(scanner.nextLine());
                    break;
                case 3:
                    // Pide al usuario que ingrese una palabra
                    System.out.print("Ingrese la palabra: ");
                    // Imprime la palabra anterior y siguiente de la palabra especificada
                    lista.imprimirPalabraAnteriorYSiguiente(scanner.nextLine());
                    break;
                case 4:
                    // Imprime un mensaje de despedida y cierra el scanner
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    // Imprime un mensaje de error para opciones inválidas
                    System.out.println("Opción no válida.");
            }
        }
    }
}
