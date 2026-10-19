public class ArbolBST {
    private NodoArbol<Integer> raiz;
    private int contadorComparaciones = 0;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoArbol<Integer> insertarRec(NodoArbol<Integer> nodo, int valor) {
        if (nodo == null) {
            return new NodoArbol<>(valor);
        }
        if (valor < nodo.getDato()) {
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), valor));
        } else {
            nodo.setDerecho(insertarRec(nodo.getDerecho(), valor));
        }
        return nodo;
    }

    public boolean buscar(int valor) {
        contadorComparaciones = 0;
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(NodoArbol<Integer> nodo, int valor) {
        contadorComparaciones++;
        if (nodo == null) {
            return false;
        }
        if (valor == nodo.getDato()) {
            return true;
        }
        return valor < nodo.getDato() ? buscarRec(nodo.getIzquierdo(), valor)
                : buscarRec(nodo.getDerecho(), valor);
    }

    public int getContadorComparaciones() {
        return contadorComparaciones;
    }

    // Método auxiliar para calcular la altura del BST
    public int obtenerAltura() {
        return calcularAlturaRec(raiz);
    }

    private int calcularAlturaRec(NodoArbol<Integer> nodo) {
        if (nodo == null) {
            return -1;
        }
        int izq = calcularAlturaRec(nodo.getIzquierdo());
        int der = calcularAlturaRec(nodo.getDerecho());
        return Math.max(izq, der) + 1;
    }
}