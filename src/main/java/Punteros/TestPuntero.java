package Punteros;

public class TestPuntero {
    public static void main(String[] args) {
        Nodo p,q;
        q = new Nodo();
        p= null;
        q.sig = null;

        q.dato = 100;
        p=q;
        System.out.println("Valor de `q` utilizando la referencia p: " + p.dato);
        p.dato = 200;
        System.out.println("Nuevo valor de `q`usando p: " + p.dato);
        System.out.println("Valor de q:" + q.dato);

        p = null;
        q = null;

    }
}
