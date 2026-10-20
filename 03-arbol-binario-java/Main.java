public class Main {
    // Método seguro para imprimir raíz e hijos previniendo NullPointerException
    public static void imprimirRaizYHijos(NodoArbol<?> nodo) {
        if (nodo == null) {
            return;
        }
        
        System.out.println("Nodo Actual: " + nodo.getDato());
        
        if (nodo.getIzquierdo() != null) {
            System.out.println("  -> Hijo Izquierdo de " + nodo.getDato() + ": " + nodo.getIzquierdo().getDato());
        } else {
            System.out.println("  -> Hijo Izquierdo de " + nodo.getDato() + ": null");
        }

        if (nodo.getDerecho() != null) {
            System.out.println("  -> Hijo Derecho de " + nodo.getDato() + ": " + nodo.getDerecho().getDato());
        } else {
            System.out.println("  -> Hijo Derecho de " + nodo.getDato() + ": null");
        }
        
        System.out.println("-----------------------------------");
        
        // Llamado recursivo seguro
        imprimirRaizYHijos(nodo.getIzquierdo());
        imprimirRaizYHijos(nodo.getDerecho());
    }

    public static void main(String[] args) {
        // Creación manual de un árbol binario de 7 nodos (Estructura de Expresión o Jerárquica)
        NodoArbol<String> raiz = new NodoArbol<>("Raíz: Sistema Base");

        NodoArbol<String> izq1 = new NodoArbol<>("Modulo Autenticacion");
        NodoArbol<String> der1 = new NodoArbol<>("Modulo Base de Datos");

        NodoArbol<String> izq2 = new NodoArbol<>("Login OAuth");
        NodoArbol<String> der2 = new NodoArbol<>("Registro Usuario");
        NodoArbol<String> izq3 = new NodoArbol<>("Conexión SQL");
        NodoArbol<String> der3 = new NodoArbol<>("Backup Automatico");

        // Enlazando referencias izquierda y derecha
        raiz.setIzquierdo(izq1);
        raiz.setDerecho(der1);

        izq1.setIzquierdo(izq2);
        izq1.setDerecho(der2);

        der1.setIzquierdo(izq3);
        der1.setDerecho(der3);

        System.out.println("=== RECORRIDO Y VALIDACION DE ARBOL BINARIO (7 NODOS) ===");
        imprimirRaizYHijos(raiz);
    }
}
