package LDE;

/**
 * Implementación de una Lista Doblemente Encadenada para manejar palabras.
 * Cada nodo contiene una palabra y su longitud.
 * @Autor Ana Lucelly Lizcano, Juan Esteban Saavedra, Esteban Salazar Mejía
 * Fecha: 25 de octubre del 2024
 * Licencia: GNU GPE
 */
public class ListaDoblementeEncadenada<T> {
    // Nodo que representa el inicio de la lista
    private NodoLDE cabeza;
    // Nodo que representa el final de la lista
    private NodoLDE cola;

    /**
     * Inserta una oración completa en la lista.
     * @param oracion La oración a insertar.
     */
    public void insertarOracion(String oracion) {
        // Divide la oración en palabras usando espacios como separadores
        String[] palabras = oracion.split("\\s+");
        // Inserta cada palabra al final de la lista
        for (String palabra : palabras) {
            insertarAlFinal(palabra);
        }
    }

    /**
     * Método privado para insertar una palabra al final de la lista.
     * @param palabra La palabra a insertar.
     */
    private void insertarAlFinal(String palabra) {
        // Crea un nuevo nodo con la palabra
        NodoLDE nuevoNodo = new NodoLDE(palabra);
        if (cabeza == null) {
            // Si la lista está vacía, el nuevo nodo es tanto la cabeza como la cola
            cabeza = cola = nuevoNodo;
        } else {
            // Si no está vacía, añade el nuevo nodo al final
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    /**
     * Imprime la lista de palabras en orden inverso, mostrando cada palabra y su longitud.
     */
    public void imprimirOrdenInverso() {
        NodoLDE actual = cola;
        while (actual != null) {
            // Imprime cada palabra con su longitud entre paréntesis
            System.out.print(actual.palabra + "(" + actual.longitud + ") ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    /**
     * Borra un nodo de la lista basado en la palabra que contiene.
     * @param palabra La palabra a buscar y borrar.
     */
    public void borrarNodo(String palabra) {
        NodoLDE actual = cabeza;
        while (actual != null) {
            if (actual.palabra.equals(palabra)) {
                // Si encuentra la palabra, ajusta los enlaces para remover el nodo
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    // Si es el primer nodo, actualiza la cabeza
                    cabeza = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    // Si es el último nodo, actualiza la cola
                    cola = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Palabra no encontrada.");
    }

    /**
     * Imprime la palabra anterior y siguiente a una palabra dada.
     * @param palabra La palabra de referencia.
     */
    public void imprimirPalabraAnteriorYSiguiente(String palabra) {
        NodoLDE actual = cabeza;
        while (actual != null) {
            if (actual.palabra.equals(palabra)) {
                // Si encuentra la palabra, imprime la anterior y la siguiente
                System.out.print("Anterior: " + (actual.anterior != null ? actual.anterior.palabra : "No hay") + ", ");
                System.out.println("Siguiente: " + (actual.siguiente != null ? actual.siguiente.palabra : "No hay"));
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Palabra no encontrada.");
    }
}
