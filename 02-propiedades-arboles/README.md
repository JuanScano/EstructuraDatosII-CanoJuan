# Guia 2: Anatomia y Propiedades de un Arbol

**Asignatura:** Estructura de Datos II  
**Estudiante:** Juan Sebastian Cano Vasquez  

---

## 1. Identificacion de Conceptos en el Arbol (Organigrama Empresarial)
* **Raiz (Nivel 0):** `Empresa Global` (Nodo principal sin padres).
* **Nodos Internos:** `Tecnologia`, `Finanzas`, `Desarrollo de Software`, `Soporte Tecnico`, `Contabilidad` y `Auditoria` (Tienen al menos un hijo).
* **Hojas (Nodos terminales - Nivel 3):** `Equipo Backend` y `Equipo Frontend` (Nodos que no tienen hijos).

---

## 2. Tabla de Metricas Manuales
* **Grado de la Raiz (Empresa Global):** 2 (Tiene 2 hijos directos: Tecnologia y Finanzas).
* **Grado del Arbol:** 2 (El numero maximo de hijos que tiene cualquier nodo de la estructura).
* **Altura del Arbol:** 3 (Longitud del camino mas largo desde la raiz hasta el nodo hoja mas profundo).
* **Profundidad de las Hojas (`Equipo Backend` y `Equipo Frontend`):** 3 (Distancia en aristas desde la raiz).

---

## 3. Resolucion de Ejercicios Teoricos
1. **Profundidad de cada hoja:**
   * La profundidad de las hojas del nivel 3 (`Equipo Backend` y `Equipo Frontend`) es de **3 aristas** respecto a la raiz.
2. **Caminos distintos y su longitud:**
   * *Camino 1:* `Empresa Global` $\rightarrow$ `Tecnologia` $\rightarrow$ `Desarrollo de Software` $\rightarrow$ `Equipo Backend` (Longitud: **3**).
   * *Camino 2:* `Empresa Global` $\rightarrow$ `Finanzas` $\rightarrow$ `Contabilidad` (Longitud: **2**).
3. **¿Que ocurre si agregamos un nuevo nivel?**
   * Si colgamos nuevos nodos de las hojas actuales (creando un Nivel 4), la **altura del arbol aumenta en 1**, pasando de 3 a 4, ya que se incrementa la longitud del camino critico desde la raiz.

---

## 4. Reflexion y Conclusiones
El analisis de la anatomia de los arboles (altura, profundidad, grado y caminos) es indispensable para comprender el rendimiento de las estructuras de datos no lineales. Conocer la altura de un arbol nos permite anticipar la complejidad en las operaciones de busqueda y recorrido, garantizando que el diseño de software en Java sea eficiente y escalable.
