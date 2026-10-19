public class Main {
    public static void main(String[] args) {
        ArbolBST bst = new ArbolBST();

        // Inserción inicial de valores de prueba
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) {
            bst.insertar(v);
        }

        System.out.println("=== PRUEBAS DE ELIMINACIÓN EN BST ===");
        System.out.print("Árbol inicial (Inorden): ");
        bst.inorden();

        // Prueba 1: Eliminar un nodo hoja (Ej: 20)
        System.out.println("\nEliminando nodo hoja (20)...");
        bst.eliminar(20);
        System.out.print("Inorden tras eliminar nodo hoja: ");
        bst.inorden();

        // Prueba 2: Eliminar un nodo con un hijo (Ej: 30, que ahora solo tiene a 40)
        System.out.println("\nEliminando nodo con un hijo (30)...");
        bst.eliminar(30);
        System.out.print("Inorden tras eliminar nodo con un hijo: ");
        bst.inorden();

        // Prueba 3: Eliminar un nodo con dos hijos / La Raíz (Ej: 50)
        System.out.println("\nEliminando la raíz con dos hijos (50)...");
        bst.eliminar(50);
        System.out.print("Inorden final (Árbol ordenado correctamente): ");
        bst.inorden();
    }
}