# Teoría sobre el uso de la función `peek` en Java

## Introducción

La función `peek` en Java es una operación intermedia en la API de Streams que permite realizar acciones sobre cada elemento de la secuencia a medida que se procesan. Es útil principalmente para el propósito de depuración y análisis, ya que permite observar los elementos en un punto particular de la cadena de operaciones sin alterar la secuencia.

## Descripción

`peek` toma un `Consumer` que se aplica a cada elemento del Stream y devuelve un Stream que es idéntico al original. A diferencia de otras operaciones como `map` o `filter`, `peek` está diseñado para tener efectos secundarios, como imprimir o registrar información sobre los elementos del Stream.

## Características Clave

1. **Operación Intermedia**: `peek` es una operación intermedia, lo que significa que devuelve un nuevo Stream y no desencadena el procesamiento del Stream por sí mismo.
2. **Efectos Secundarios**: Se utiliza principalmente para efectos secundarios como depuración, registro o modificación externa de elementos.
3. **Transparente**: No modifica los elementos del Stream, sino que permite observarlos en su estado actual.

## Sintaxis

```java
Stream<T> peek(Consumer<? super T> action)
```
**Parámetros**
+ action: Una acción a realizar sobre cada elemento del Stream. Es un Consumer que acepta un solo argumento y no devuelve ningún resultado.

## Ejemplos Practicos

**Ejemplo 1: Depuración**

Un uso común de peek es la depuración. Puedes imprimir los elementos del Stream en varios puntos de la cadena de operaciones para entender cómo se transforman.

```java
import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .peek(name -> System.out.println("Filtered name: " + name))
             .map(String::toUpperCase)
             .peek(name -> System.out.println("Mapped name: " + name))
             .forEach(name -> System.out.println("Final name: " + name));
    }
}
```

**Ejemplo 2: Modificación de Elementos Externos**

Aunque peek no está diseñado para modificar elementos del Stream, puede ser usado para modificar objetos externos a los elementos del Stream, como contadores o registros.

```java
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PeekExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        AtomicInteger counter = new AtomicInteger(0);

        names.stream()
             .peek(name -> counter.incrementAndGet())
             .forEach(name -> System.out.println("Name: " + name));

        System.out.println("Total names processed: " + counter.get());
    }
}
```