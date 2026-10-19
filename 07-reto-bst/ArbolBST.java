package 07-reto-bst;

public class ArbolBST {
    private NodoArbol raiz;
    private int comparacionesUltimaBusqueda = 0;

    public void insertar(Producto producto) {
        raiz = insertarRec(raiz, producto);
    }

    private NodoArbol insertarRec(NodoArbol nodo, Producto producto) {
        if (nodo == null) {
            return new NodoArbol(producto);
        }
        if (producto.getCodigo() < nodo.getDato().getCodigo()) {
            nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(), producto));
        } else if (producto.getCodigo() > nodo.getDato().getCodigo()) {
            nodo.setDerecho(insertarRec(nodo.getDerecho(), producto));
        }
        // Si el código ya existe, no se duplica (mantiene invariante)
        return nodo;
    }

    public Producto buscar(int codigo) {
        comparacionesUltimaBusqueda = 0;
        return buscarRec(raiz, codigo);
    }

    private Producto buscarRec(NodoArbol nodo, int codigo) {
        comparacionesUltimaBusqueda++;
        if (nodo == null) {
            return null;
        }
        if (codigo == nodo.getDato().getCodigo()) {
            return nodo.getDato();
        }
        return codigo < nodo.getDato().getCodigo() 
            ? buscarRec(nodo.getIzquierdo(), codigo) 
            : buscarRec(nodo.getDerecho(), codigo);
    }

    public int getComparacionesUltimaBusqueda() {
        return comparacionesUltimaBusqueda;
    }

    public void eliminar(int codigo) {
        raiz = eliminarRec(raiz, codigo);
    }

    private NodoArbol eliminarRec(NodoArbol nodo, int codigo) {
        if (nodo == null) return null;

        if (codigo < nodo.getDato().getCodigo()) {
            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), codigo));
        } else if (codigo > nodo.getDato().getCodigo()) {
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), codigo));
        } else {
            if (nodo.getIzquierdo() == null) return nodo.getDerecho();
            if (nodo.getDerecho() == null) return nodo.getIzquierdo();

            nodo.setDato(minValor(nodo.getDerecho()));
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), nodo.getDato().getCodigo()));
        }
        return nodo;
    }

    private Producto minValor(NodoArbol nodo) {
        Producto min = nodo.getDato();
        while (nodo.getIzquierdo() != null) {
            min = nodo.getIzquierdo().getDato();
            nodo = nodo.getIzquierdo();
        }
        return min;
    }

    public Producto obtenerMinimo() {
        if (raiz == null) return null;
        NodoArbol actual = raiz;
        while (actual.getIzquierdo() != null) {
            actual = actual.getIzquierdo();
        }
        return actual.getDato();
    }

    public Producto obtenerMaximo() {
        if (raiz == null) return null;
        NodoArbol actual = raiz;
        while (actual.getDerecho() != null) {
            actual = actual.getDerecho();
        }
        return actual.getDato();
    }

    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(NodoArbol nodo) {
        if (nodo != null) {
            inordenRec(nodo.getIzquierdo());
            System.out.println("  -> " + nodo.getDato());
            inordenRec(nodo.getDerecho());
        }
    }
}