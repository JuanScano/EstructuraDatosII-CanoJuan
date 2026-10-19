# Guía 6: Recorridos en árboles binarios ("Exploradores del árbol")

**Estudiante:** Juan Sebastian Cano Vasquez  
**Asignatura:** Estructura de Datos II  

---

## 1. Tabla comparativa de secuencias obtenidas (10 Productos)

| Tipo de Recorrido | Algoritmo / Patrón | Secuencia de Códigos Obtenida |
| :--- | :--- | :--- |
| **Preorden** | Raíz $\rightarrow$ Izquierda $\rightarrow$ Derecha | `50 30 20 10 40 35 70 60 80 90` |
| **Inorden** | Izquierda $\rightarrow$ Raíz $\rightarrow$ Derecha | `10 20 30 35 40 50 60 70 80 90` |
| **Postorden** | Izquierda $\rightarrow$ Derecha $\rightarrow$ Raíz | `10 20 35 40 30 60 90 80 70 50` |
| **Por Niveles** | Visita por profundidad creciente (Cola) | `50 30 70 20 40 60 80 10 35 90` |

---

## 2. Análisis y Casos de Uso

* **Inorden:**  
  * *Comprobación:* Como se observa en la tabla, el recorrido Inorden devuelve las claves del BST estrictamente ordenadas de menor a mayor (`10` hasta `90`), cumpliendo con la propiedad de ordenación del árbol de búsqueda.
  * *Caso de uso:* Generación de reportes de inventario ordenados alfabéticamente o numéricamente sin necesidad de algoritmos de ordenamiento externos.

* **Preorden:**  
  * *Caso de uso:* Duplicación o clonación completa de estructuras de árboles y serialización de jerarquías para guardarlas en archivos o bases de datos, permitiendo reconstruir el árbol exactamente igual al insertar los elementos en ese mismo orden.

* **Postorden (Ideal para eliminar un árbol de forma segura):**  
  * *Justificación:* El recorrido Postorden procesa primero los subárboles (hijos izquierdo y derecho) antes de visitar la raíz. Esto garantiza que **nunca se pierda la referencia a los hijos** mientras se liberan los nodos de memoria de abajo hacia arriba, evitando fugas de memoria o errores de referencias huérfanas al destruir la estructura.

* **Por Niveles:**  
  * *Caso de uso:* Impresión gráfica de organigramas jerárquicos o algoritmos de búsqueda de caminos mínimos y rutas en redes y grafos estructurados por capas.