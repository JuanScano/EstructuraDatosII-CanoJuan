# Guía 5: BST II - Eliminación de Nodos

**Estudiante:** Juan Sebastian Cano Vasquez  
**Asignatura:** Estructura de Datos II  

---

## 1. Explicación de los Tres Casos de Eliminación
El proceso de eliminación en un Árbol Binario de Búsqueda (BST) requiere preservar la propiedad de orden en todo momento[cite: 14]:
1. **Caso 1: Nodo Hoja (Sin hijos):**  
   El nodo se elimina directamente devolviendo `null` al padre, rompiendo el enlace de referencia de manera limpia sin afectar el resto de la estructura.
2. **Caso 2: Nodo con un solo hijo:**  
   El nodo es reemplazado por su único descendiente directo (izquierdo o derecho), actualizando el puntero del padre para que apunte al subárbol subyacente.
3. **Caso 3: Nodo con dos hijos:**  
   Se localiza el **sucesor inorden** (el valor mínimo ubicado en el subárbol derecho del nodo a eliminar). Se reemplaza el valor del nodo actual por el del sucesor y, posteriormente, se elimina recursivamente el nodo duplicado del subárbol derecho[cite: 14].

---

## 2. Validación de la Propiedad BST
Tras la ejecución de las pruebas unitarias (eliminación de hoja, nodo intermedio y la raíz), los recorridos inorden demuestran que la estructura mantiene estrictamente el orden ascendente de los elementos, validando la correcta reasignación de referencias en memoria.