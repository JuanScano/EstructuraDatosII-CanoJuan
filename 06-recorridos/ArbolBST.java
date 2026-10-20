package 06-recorridos;

import java.util.LinkedList;
import java.util.Queue;

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

    // 1. Recorrido Preorden (Raíz -> Izquierda -> Derecha)
    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }
    private void preordenRec(NodoArbol<Integer> nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            preordenRec(nodo.getIzquierdo());
            preordenRec(nodo.getDerecho());
        }
    }

    // 2. Recorrido Inorden (Izquierda -> Raiz -> Derecha) -> Devuelve claves ordenadas en un BST
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

    // 3. Recorrido Postorden (Izquierda -> Derecha -> Raíz)
    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }
    private void postordenRec(NodoArbol<Integer> nodo) {
        if (nodo != null) {
            postordenRec(nodo.getIzquierdo());
            postordenRec(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }

    // 4. Recorrido por Niveles (Anchura / Breadth-First usando una Cola)
    public void porNiveles() {
        if (raiz == null) return;
        Queue<NodoArbol<Integer>> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            NodoArbol<Integer> actual = cola.poll();
            System.out.print(actual.getDato() + " ");

            if (actual.getIzquierdo() != null) {
                cola.add(actual.getIzquierdo());
            }
            if (actual.getDerecho() != null) {
                cola.add(actual.getDerecho());
            }
        }
        System.out.println();
    }
}
