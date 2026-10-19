package 04-bst-insercion-busqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBST bstAleatorio = new ArbolBST();
        ArbolBST bstOrdenado = new ArbolBST();

        // 15 códigos de productos en orden aleatorio
        int[] codigosAleatorios = {50, 20, 70, 10, 30, 60, 80, 5, 25, 35, 65, 85, 55, 45, 90};
        
        // 15 códigos de productos en orden estrictamente ascendente (para causar degeneración)
        int[] codigosOrdenados = {5, 10, 20, 25, 30, 35, 45, 50, 55, 60, 65, 70, 80, 85, 90};

        // Insertar datos
        for (int c : codigosAleatorios) {
            bstAleatorio.insertar(c);
        }
        for (int c : codigosOrdenados) {
            bstOrdenado.insertar(c);
        }

        System.out.println("=== COMPARACIÓN DE EFICIENCIA EN ÁRBOL BST ===");
        System.out.println("BST con Inserción Aleatoria -> Altura: " + bstAleatorio.obtenerAltura());
        System.out.println("BST con Inserción Ordenada  -> Altura: " + bstOrdenado.obtenerAltura());

        // Pruebas de búsqueda
        int[] valoresBusqueda = {35, 80, 99, 10, 55};
        System.out.println("\n--- PRUEBAS DE BÚSQUEDA EN BST ALEATORIO ---");
        for (int v : valoresBusqueda) {
            boolean encontrado = bstAleatorio.buscar(v);
            System.out.println("Buscando " + v + ": " + (encontrado ? "Encontrado" : "No encontrado") + 
                               " (Comparaciones: " + bstAleatorio.getContadorComparaciones() + ")");
        }
    }
}