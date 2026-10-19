# Guía 3: Árbol binario y modelado en Java

**Estudiante:** Juan Sebastian Cano Vasquez  
**Asignatura:** Estructura de Datos II  

---

## 1. Clasificación de Árboles Binarios (Diagramas en Draw.io)
En el archivo `ArbolBinario.drawio` se modelan los cuatro tipos solicitados:
* **Lleno:** Todo nodo tiene 0 o 2 hijos y todas las hojas están al mismo nivel.
* **Completo:** Todos los niveles están completamente llenos, excepto posiblemente el último, el cual se llena de izquierda a derecha.
* **Perfecto:** Un árbol lleno donde todas las hojas se encuentran en el mismo nivel máximo.
* **Degenerado:** Cada nodo padre tiene un único hijo (comportándose estructuralmente de forma similar a una lista enlazada).

---

## 2. Clasificación del Árbol de 7 Nodos Implementado
El árbol binario de 7 nodos construido en el proyecto corresponde a un **Árbol Binario Completo / Lleno**, ya que la raíz y sus dos subniveles inmediatos poseen exactamente sus dos referencias (izquierda y derecha) ocupadas de forma simétrica.

---

## 3. Ejercicios Teóricos
1. **Diferencia entre una referencia `null` y un nodo hoja:**
   * Una **referencia `null`** es un apuntador vacío que indica la ausencia absoluta de un objeto en memoria (un enlace no conectado).
   * Un **nodo hoja** es un objeto nodo válido dentro de la estructura que contiene un dato legítimo, pero cuyas referencias izquierda y derecha apuntan ambas a `null`.
2. **Árbol de expresiones (Ejemplo conceptual):**
   * Un árbol binario permite evaluar expresiones matemáticas u lógicas de manera natural, donde los nodos internos almacenan operadores aritméticos (ej. `+`, `*`) y los nodos hoja almacenan los operandos (ej. `5`, `10`), permitiendo recorridos en orden, preorden o postorden.

---

## 4. Explicación del Modelo en Memoria
El modelo se basa en referencias dinámicas en memoria a través de la clase genérica `NodoArbol<T>`. Cada instancia de nodo aloja un valor de tipo genérico y dos punteros (`izquierdo` y `derecho`). El control de excepciones y validaciones de punteros nulos (`null`) garantiza que la navegación recursiva a través de los subárboles se ejecute de manera segura sin interrumpir la ejecución del programa.