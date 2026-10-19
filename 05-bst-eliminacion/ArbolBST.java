package 05-bst-eliminacion;

public class ArbolBST {
    private NodoArbol<Integer> raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoArbol<Integer> insertarRec(NodoArbol<Integer> nodo, int valor) {
        if (nodo == null) {
            return new NodoArbol<>(valor);
        }
        if (valor < nodo.getDato()) {
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), valor));
        } else if (valor > nodo.getDato()) {
            nodo.setDerecho(insertarRec(nodo.getDerecho(), valor));
        }
        return nodo;
    }

    // Método público para eliminar
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    // Método auxiliar para encontrar el valor mínimo (sucesor inorden)
    private int minValor(NodoArbol<Integer> nodo) {
        int min = nodo.getDato();
        while (nodo.getIzquierdo() != null) {
            min = nodo.getIzquierdo().getDato();
            nodo = nodo.getIzquierdo();
        }
        return min;
    }

    // Algoritmo recursivo de eliminación (Tres casos)
    private NodoArbol<Integer> eliminarRec(NodoArbol<Integer> nodo, int valor) {
        if (nodo == null) {
            return null;
        }

        if (valor < nodo.getDato()) {
            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), valor));
        } else if (valor > nodo.getDato()) {
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), valor));
        } else {
            // CASO 1: Nodo hoja o con un solo hijo
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            } else if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }

            // CASO 3: Nodo con dos hijos
            // Obtener el sucesor inorden (el menor del subárbol derecho)
            nodo.setDato(minValor(nodo.getDerecho()));

            // Eliminar el sucesor inorden del subárbol derecho
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), nodo.getDato()));
        }
        return nodo;
    }

    // Recorrido en orden para verificar el estado del BST
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(NodoArbol<Integer> nodo) {
        if (nodo != null) {
            inordenRec(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inordenRec(nodo.getDerecho());
        }
    }
}