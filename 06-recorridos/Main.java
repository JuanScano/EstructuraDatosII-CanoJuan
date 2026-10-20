package 06-recorridos;

public class Main {
    public static void main(String[] args) {
        ArbolBST bst = new ArbolBST();

        // 10 códigos de productos para poblar el árbol
        int[] codigosProductos = {50, 30, 70, 20, 40, 60, 80, 10, 35, 90};

        for (int codigo : codigosProductos) {
            bst.insertar(codigo);
        }

        System.out.println("=== EXPLORADORES DEL ARBOL: RECORRIDOS ===");
        System.out.print("1. Preorden    (Raiz-Izq-Der): ");
        bst.preorden();

        System.out.print("2. Inorden     (Izq-Raiz-Der): ");
        bst.inorden();

        System.out.print("3. Postorden   (Izq-Der-Raiz): ");
        bst.postorden();

        System.out.print("4. Por Niveles (Anchura/Cola): ");
        bst.porNiveles();
    }
}
