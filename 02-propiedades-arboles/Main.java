public class Main {
    // Método recursivo para calcular la altura del árbol
    public static int altura(NodoGeneral<?> nodo) {
        if (nodo.getHijos().isEmpty()) {
            return 0; // Caso base: una hoja tiene altura 0
        }
        int max = 0;
        for (NodoGeneral<?> hijo : nodo.getHijos()) {
            max = Math.max(max, altura(hijo));
        }
        return 1 + max;
    }

    public static void main(String[] args) {
        // Nivel 0 (Raíz)
        NodoGeneral<String> raiz = new NodoGeneral<>("Empresa Global");

        // Nivel 1
        NodoGeneral<String> tecnologia = new NodoGeneral<>("Tecnologia");
        NodoGeneral<String> finanzas = new NodoGeneral<>("Finanzas");

        // Nivel 2
        NodoGeneral<String> desarrollo = new NodoGeneral<>("Desarrollo de Software");
        NodoGeneral<String> soporte = new NodoGeneral<>("Soporte Tecnico");
        NodoGeneral<String> contabilidad = new NodoGeneral<>("Contabilidad");
        NodoGeneral<String> auditoria = new NodoGeneral<>("Auditoria");
        NodoGeneral<String> rrhh = new NodoGeneral<>("Recursos Humanos");

        // Nivel 3 (Hojas)
        NodoGeneral<String> backend = new NodoGeneral<>("Equipo Backend");
        NodoGeneral<String> frontend = new NodoGeneral<>("Equipo Frontend");
        NodoGeneral<String> mesaAyuda = new NodoGeneral<>("Mesa de Ayuda");
        NodoGeneral<String> nomina = new NodoGeneral<>("Nomina");
        NodoGeneral<String> legal = new NodoGeneral<>("Legal");

        // Construcción de la jerarquía (12 nodos / 4 niveles: 0, 1, 2, 3)
        raiz.agregarHijo(tecnologia);
        raiz.agregarHijo(finanzas);

        tecnologia.agregarHijo(desarrollo);
        tecnologia.agregarHijo(soporte);

        finanzas.agregarHijo(contabilidad);
        finanzas.agregarHijo(auditoria);
        finanzas.agregarHijo(rrhh);

        desarrollo.agregarHijo(backend);
        desarrollo.agregarHijo(frontend);

        soporte.agregarHijo(mesaAyuda);
        contabilidad.agregarHijo(nomina);
        auditoria.agregarHijo(legal);

        // Imprimir altura-calculada
        int alturaCalculada = altura(raiz);
        System.out.println("=== ANATOMIA Y PROPIEDADES DEL ARBOL ===");
        System.out.println("Raiz: " + raiz.getDato());
        System.out.println("Altura total calculada recursivamente: " + alturaCalculada);
    }
}
