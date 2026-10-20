public class Main {
    // Método auxiliar para imprimir la jerarquia en consola con sangría
    public static void imprimirArbol(NodoGeneral<?> nodo, String tabulacion) {
        System.out.println(tabulacion + "- " + nodo.getDato());
        for (NodoGeneral<?> hijo : nodo.getHijos()) {
            imprimirArbol(hijo, tabulacion + "    ");
        }
    }

    public static void main(String[] args) {
        // Raíz
        NodoGeneral<String> raiz = new NodoGeneral<>("Empresa Global");

        // Nivel 1
        NodoGeneral<String> tecnologia = new NodoGeneral<>("Tecnologia");
        NodoGeneral<String> finanzas = new NodoGeneral<>("Finanzas");

        // Nivel 2
        NodoGeneral<String> desarrollo = new NodoGeneral<>("Desarrollo de Software");
        NodoGeneral<String> soporte = new NodoGeneral<>("Soporte Tecnico");
        NodoGeneral<String> contabilidad = new NodoGeneral<>("Contabilidad");
        NodoGeneral<String> auditoria = new NodoGeneral<>("Auditoria");

        // Nivel 3
        NodoGeneral<String> backend = new NodoGeneral<>("Equipo Backend");
        NodoGeneral<String> frontend = new NodoGeneral<>("Equipo Frontend");

        // Construcción de la jerarquía
        raiz.agregarHijo(tecnologia);
        raiz.agregarHijo(finanzas);

        tecnologia.agregarHijo(desarrollo);
        tecnologia.agregarHijo(soporte);

        finanzas.agregarHijo(contabilidad);
        finanzas.agregarHijo(auditoria);

        desarrollo.agregarHijo(backend);
        desarrollo.agregarHijo(frontend);

        // Imprimir árbol en consola
        System.out.println("=== JERARQUIA ORGANIZACIONAL ===");
        imprimirArbol(raiz, "");
    }
}
