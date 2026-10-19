# Guía 4: BST I - Inserción y Búsqueda

**Estudiante:** Juan Sebastian Cano Vasquez  
**Asignatura:** Estructura de Datos II  

---

## 1. Ejercicios Teóricos
* **Inserción de valores (50, 30, 70, 20, 40, 60, 80):**
  El árbol resultante posiciona a 50 como raíz, con los menores (30, 20, 40) en el subárbol izquierdo y los mayores (70, 60, 80) en el subárbol derecho.
* **Búsqueda de un valor existente vs. inexistente:**
  * *Existente (ej. 40):* Recorrido Raíz (50) -> Izquierda (30) -> Derecha (40). (3 comparaciones).
  * *Inexistente (ej. 65):* Recorrido Raíz (50) -> Derecha (70) -> Izquierda (60) -> Derecha (Null). 
* **¿Por qué insertar datos ya ordenados degrada el rendimiento?**
  Cuando los datos se insertan en orden secuencial (ascendente o descendente), el BST pierde su balance y se convierte en un árbol degenerado (similar estructuralmente a una lista enlazada). Esto hace que la altura crezca linealmente a $O(n)$, obligando al algoritmo a recorrer todos los nodos en el peor caso, perdiendo la ventaja logarítmica de búsqueda.

---

## 2. Análisis de Eficiencia: $O(\log n)$ frente a $O(n)$
* **Caso Promedio / Balanceado ($O(\log n)$):** Ocurre cuando los elementos se insertan de manera aleatoria. La altura del árbol se aproxima a $\log_2(n)$, lo que reduce exponencialmente las comparaciones necesarias para localizar un elemento.
* **Peor Caso / Degenerado ($O(n)$):** Ocurre ante inserciones ordenadas. La altura se vuelve igual a $n - 1$, anulando la eficiencia del árbol y requiriendo un recorrido secuencial idéntico al de un arreglo plano.
