# Guía 7: Reto Integrador BST - Sistema de Inventario Jerárquico

**Estudiante:** Juan Sebastian Cano Vasquez  
**Asignatura:** Estructura de Datos II  

---

## 1. Análisis de Complejidad (Notación Big O)

| Operación | Caso Promedio / Balanceado | Peor Caso (Árbol Degenerado) | Justificación |
| :--- | :---: | :---: | :--- |
| **Inserción** | $O(\log n)$ | $O(n)$ | Sigue un único camino desde la raíz hasta la hoja vacía según la comparación de claves. |
| **Búsqueda** | $O(\log n)$ | $O(n)$ | Divide el espacio de búsqueda a la mitad en cada nivel si está balanceado. |
| **Eliminación** | $O(\log n)$ | $O(n)$ | Combina la búsqueda del nodo objetivo con la localización del sucesor inorden. |
| **Recorrido Inorden** | $O(n)$ | $O(n)$ | Visita cada nodo exactamente una vez para presentar el inventario ordenado. |

---

## 2. Arquitectura de Clases
* **`Producto`:** Modela la entidad de negocio (código, nombre, cantidad).
* **`NodoArbol`:** Contiene la referencia al objeto `Producto` y punteros a sus hijos izquierdo y derecho.
* **`ArbolBST`:** Encapsula la lógica recursiva de manipulación del árbol binario de búsqueda.
* **`Main`:** Administra la interfaz de consola mediante un menú interactivo con validaciones de duplicados y errores.