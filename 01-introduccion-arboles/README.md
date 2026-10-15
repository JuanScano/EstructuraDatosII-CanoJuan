# Guía 1: De lo lineal a lo jerárquico

**Estudiante:** Juan Sebastian Cano Vasquez  
**Asignatura:** Estructura de Datos II  

---

## 1. Clasificación y Análisis de Escenarios
* **Sistema de archivos:** **Jerárquico.** Se organiza desde un directorio raíz que contiene subcarpetas y archivos en múltiples niveles anidados.
* **Organigrama empresarial:** **Jerárquico.** Refleja los niveles de mando y subordinación de una organización partiendo de una dirección general.
* **Menú de aplicación:** **Mixto.** Posee una navegación jerárquica para menús desplegables anidados y lineal para barras de opciones sencillas.
* **Árbol genealógico:** **Jerárquico.** Muestra las relaciones de linaje y descendencia de antepasados a sucesores.

---

## 2. Ejercicios Teóricos
1. **Ventajas de representar el problema con un árbol en vez de una lista:**
   * Permite modelar relaciones naturales de "uno a muchos" (padre-hijos).
   * Organiza la información en niveles lógicos, optimizando la navegación y búsqueda frente a un recorrido lineal secuencial.
2. **¿Qué ocurre si un nodo pudiera tener más de un padre?**
   * El modelo deja de ser un árbol jerárquico estricto y se convierte en un **Grafo Dirigido**. Esto incrementa la complejidad algorítmica al requerir el manejo de ciclos y múltiples rutas de acceso al mismo nodo.

---

## 3. Reflexión (Transición de lo Lineal a lo Jerárquico)
El estudio de las estructuras no lineales, en particular de los árboles, representa un paso fundamental en el desarrollo de software y el diseño de algoritmos. Mientras que las estructuras lineales como arreglos, listas enlazadas, pilas y colas resultan idóneas para procesar secuencias homogéneas e independientes de datos, la gran mayoría de problemas y sistemas reales poseen relaciones intrínsecas de dependencia y jerarquía. 

Sistemas como el almacenamiento de archivos en un sistema operativo, la estructuración de documentos HTML/XML en el DOM, o la representación de organizaciones empresariales no pueden modelarse de forma eficiente mediante listas planas. La transición hacia modelos jerárquicos nos permite organizar los datos en niveles lógicos mediante nodos interconectados con relaciones de padre e hijo. Esto facilita búsquedas más eficientes, un acceso estructurado a la información y una abstracción mucho más cercana a cómo funcionan los procesos en el mundo real.

---

## 4. Diagrama del Modelo
El diagrama correspondiente se encuentra adjunto en el repositorio como `diagrama.drawio` y exportado en formato PDF/PNG.
