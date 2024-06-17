# Trabajando con Lista y Colecciones de datos

## CLASS COLECTIONS
[Class Collections](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html) cuenta exclusivamente con metodo estaticos que se operan o devuelven o colecciones. Un metodo estatico es aquel que tiene sentido invocarla sin crear previamente ninguna instancia de esa clase. Entre los metodos tenemos a los siguientes:

**Sort:** Cada objeto de la lista debe implementar la interfaz Comparable. Ademas todos los elementos deberian ser comparables (e1.CompareTo(e2)).
```java
public static < T extends Comparable<? super T> >
void sort(List<T> list)
```
**Binary Search:** Previamente la lista debe estar ordenada. Tiene complejidad log(n) para una lista que implementa la interfaz "RandomAccess". 
```java
public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
```

***Parametros***: 
* list: Lista por ser utilizada
* T: La clase de los objetos en la lista

## COMPARATOR INTERFACE
Un comparador es una interfaz funcional que permite comparar dos objetos para determinar su orden relativo.
Veamos el metodo `comparing`. (Recordar que es una interfaz, por lo que no existe implementacion).
```java 
static <T,U> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator)
```
```java
 lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
```
**Expresion lambda:** Las expresiones lambda son una forma concisa de crear objetos anónimos que implementan interfaces funcionales. 

> Explicacion: En este caso, el profesor está utilizando una expresión lambda para crear un objeto Comparator. Aquí, Titulo::getFechaLanzamiento es una referencia de método que apunta al método getFechaLanzamiento() de la clase Titulo

## COMPARABLE<T> INTERFACE
**compareTo:** Compara este objeto con el objeto especificado para el orden.

## LIST<T> INTERFACE
Nos permite poder controlar los elementos de una lista. Ademas, a diferencia de un `Set` una lista nos permite elementos duplicados and elementos nulos. La lista contiene una iterador especial llamado `ListIterator`, que permite a la lista añadir y reemplazar.

**Sort:** Ordena la lista haciendo uso de un comparador `Comparator` como argumento.
```java
// Interfaz Comparator, ejemplo de metodo compare
int compare(T o1, T o2)

// Interfaz List utilizando un Comparator
default void sort(Comparator<? super E> c)
```
> Explicacion: La declaración `Comparator<? super E> c` significa que el método sort toma un comparador (`c`) que puede comparar objetos de tipo `E` o cualquier superclase de `E`.

***Parametros:***
* c: El comparador usado para comparar la lista de elementos.

# Gestores de Paquetes
**Java**
* Maven
* Gradle
* Ant

**Python**
* PIP

# Bibliotecas y Frameworks
Las bibliotecas y frameworks en Java, y también en otros lenguajes de programación, son herramientas esenciales para quienes trabajan con programación, ya que ayudan a reducir la cantidad de trabajo requerido para construir aplicaciones, debido a que brindan funcionalidades listas para usar, lo que permite a los desarrolladores centrarse en la lógica de negocio de los proyectos, en lugar de preocuparse por problemas técnicos que son comunes y que ya tienen soluciones listas para usar.

En Java, las bibliotecas son colecciones de clases e interfaces que ofrecen una serie de recursos y funcionalidades listas para usar. Generalmente se distribuyen como archivos JAR (Java Archive), que son paquetes de archivos Java que contienen clases y otros recursos, como imágenes y archivos de configuración. Las bibliotecas se pueden importar en proyectos Java y usarse directamente en el código para implementar funcionalidades específicas, como manipulación de archivos, conexión a bases de datos, criptografía, etc.

Los frameworks, por otro lado, son estructuras de software que proporcionan una arquitectura básica para desarrollar aplicaciones. Incluyen bibliotecas, patrones y mejores prácticas para guiar el proceso de desarrollo de aplicaciones. Se puede considerar un framework como una "fábrica de aplicaciones estandarizadas" que proporciona los componentes necesarios para crear una aplicación, así como un conjunto de reglas y pautas para guiarlo en el proceso, como por ejemplo una serie de carpetas en donde colocar ciertos archivos.

Hay muchos frameworks populares en Java, cada uno con sus propias características y objetivos. Algunos ejemplos incluyen Spring Framework, que es un framework que facilita la creación de aplicaciones web y APIs Rest complejas en Java; Hibernate, que es un framework de mapeo objeto-relacional y simplifica enormemente el proceso de integración de una aplicación Java con una base de datos relacional.

# DTO (Data Transfer Object)
# Java Record
Lanzado oficialmente en Java 16, pero disponible desde Java 14 de forma experimental, Record es una característica que le permite representar una clase inmutable, que contiene solo atributos, constructor y métodos de lectura, de una manera muy simple y sencilla. 

Es decir un `Record` es como una clase pero mas simple. El objetivo es almancenar informacion y obtener informacion rapidamente, ademas este nos proporciona sus getters, setters y un toString especifico.

Esta característica encaja perfectamente cuando necesitamos crear un objeto solo para representar datos, sin ningún tipo de comportamiento.

# Libreria java.io

**La clase File**

La clase File representa un archivo o directorio en el sistema de archivos de la computadora, lo que le permite crear, eliminar, listar y manipular archivos y directorios.

**La clase FileReader y FileWriter**

Las clases FileReader y FileWriter se utilizan para leer y escribir datos en archivos de texto; la clase FileReader lee caracteres de un archivo de texto, mientras que la clase FileWriter escribe los caracteres.
```java
File file = new File("C:\\miArchivo.txt");
FileReader reader = new FileReader(file);

int data = reader.read();
while (data != -1) {
    System.out.print((char) data);
    data = reader.read();
}
reader.close();
```

```java
File file = new File("C:\\salida.txt");
FileWriter writer = new FileWriter(file);
writer.write("Hola mundo!");
writer.close();
```

El paquete java.io también proporciona otras clases útiles como:

* **BufferedReader y BufferedWriter:** se utilizan para leer y escribir archivos de texto de manera eficiente, leyendo y escribiendo una línea a la vez. Utilizan un búfer para almacenar datos, lo que hace que la lectura y la escritura sean más rápidas que cuando se hacen de un carácter a la vez;
* **FileInputStream y FileOutputStream:** se utilizan para leer y escribir `datos binarios` en un archivo. Se utilizan para leer y escribir datos en archivos que no son de texto, como imágenes y archivos de audio;
* **ObjectInputStream y ObjectOutputStream:** se utilizan para leer y escribir objetos en archivos. Esto le permite almacenar `objetos` Java en archivos para su uso posterior o para transferirlos entre diferentes aplicaciones.