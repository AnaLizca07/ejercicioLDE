package LDE;

/**
 * Representa un nodo en una lista loblemente enlazada
 * Cada noto contiene una palabra y su longitud
 * @Autor Ana Lucelly Lizcano, Juan Esteban Saavedra, Esteban Salazar Mejía
  * Fecha: 25 de octubre del 2024
  * Licencia: GNU GPE
 */
public class NodoLDE {
    /**
     * La palabra que se guarda en el nodo
     */
    String palabra;

    /**
     * La longitud de la palabra
     */
    int longitud;

    /**
     * El nodo anterior de la lista doblemente enlazada
     */
    NodoLDE anterior;

    /**
     * El nodo siguiente de la lista doblemente enlazada
     */
    NodoLDE siguiente;

    /**
     * Constructs a new node with the given word.
     * Constructor de un nuevo nodo con una palabra que recibe por parámetro
     *
     * @param palabra La palabra que se guarda en el nodo
     */
    NodoLDE(String palabra) {
        this.palabra = palabra;
        this.longitud = palabra.length();
    }
}
