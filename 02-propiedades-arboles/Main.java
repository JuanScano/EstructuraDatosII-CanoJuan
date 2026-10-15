import java.util.ArrayList;
import java.util.List;

class NodoGeneral<T> {
    private T dato;
    private List<NodoGeneral<T>> hijos = new ArrayList<>();

    public NodoGeneral(T dato) {
        this.dato = dato;
    }

    public void agregarHijo(NodoGeneral<T> hijo) {
        hijos.add(hijo);
    }

    public T getDato() {
        return dato;
    }

    public List<NodoGeneral<T>> getHijos() {
        return hijos;
    }
}

public class Main {
    // La altura del arbol
    public static int altura(NodoGeneral<?> nodo) {
        if (nodo.getHijos().isEmpty()) {
            return 0; //Si es una hoja, retorna altura 0
        }
        int max = 0;
        for (NodoGeneral<?> hijo : nodo.getHijos()) {
            max = Math.max(max, altura(hijo));
        }
        return 1 + max;
    }

    public static void main(String[] args) {
        // Nivel 0 (Raiz)
        NodoGeneral<String> raiz = new NodoGeneral<>("Empresa Global");

        // Nivel 1
        NodoGeneral<String> tecnologia = new NodoGeneral<>("Tecnologia");
        NodoGeneral<String> finanzas = new NodoGeneral<>("Finanzas");

        // Nivel 2
        NodoGeneral<String> desarrollo = new NodoGeneral<>("Desarrollo de Software");
        NodoGeneral<String> soporte = new NodoGeneral<>("Soporte Tecnico");
        NodoGeneral<String> contabilidad = new NodoGeneral<>("Contabilidad");
        NodoGeneral<String> auditoria = new NodoGeneral<>("Auditoria");

        // Nivel 3 (Hojas)
        NodoGeneral<String> backend = new NodoGeneral<>("Equipo Backend");
        NodoGeneral<String> frontend = new NodoGeneral<>("Equipo Frontend");

        // Construccion
        raiz.agregarHijo(tecnologia);
        raiz.agregarHijo(finanzas);

        tecnologia.agregarHijo(desarrollo);
        tecnologia.agregarHijo(soporte);

        finanzas.agregarHijo(contabilidad);
        finanzas.agregarHijo(auditoria);

        desarrollo.agregarHijo(backend);
        desarrollo.agregarHijo(frontend);

        // Calculo-prueba de la altura del arbol
        int alturaTotal = altura(raiz);
        
        System.out.println("=== ANATOMIA Y PROPIEDADES DEL ARBOL (CASO EMPRESA) ===");
        System.out.println("Raiz del arbol: " + raiz.getDato());
        System.out.println("Altura total calculada por el metodo recursivo: " + alturaTotal);
    }
}
