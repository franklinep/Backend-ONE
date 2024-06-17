# Teoría de Streams en Java

## Introducción

Los Streams en Java se introdujeron en Java 8 como una parte clave de la API de Streams, la cual permite procesar secuencias de elementos de una manera declarativa. Esto significa que puedes expresar operaciones comunes sobre colecciones (como filtrado, mapeo y reducción) de manera concisa y legible, utilizando un estilo funcional.

## ¿Qué es un Stream?

Un Stream en Java es una secuencia de elementos que soporta operaciones agregadas secuenciales y paralelas. A diferencia de las colecciones, un Stream no almacena elementos; en su lugar, proporciona una vista de datos que se procesarán bajo demanda.

## Características Clave

1. **Sin almacenamiento**: Un Stream no almacena datos, sino que opera sobre la fuente de datos subyacente, como una colección, un array o una entrada/archivo de E/S.
2. **Inmutabilidad**: Las operaciones sobre un Stream no modifican su fuente; en su lugar, producen un nuevo Stream.
3. **Laziness (evaluación perezosa)**: Muchos de los métodos de Stream son intermedios y se evalúan de forma perezosa, lo que significa que no se ejecutan hasta que se invoca una operación terminal.
4. **Operaciones en cadena**: Las operaciones de Stream se pueden encadenar, lo que facilita la creación de tuberías (pipelines) de procesamiento de datos.

## Tipos de Operaciones

### Operaciones Intermedias

Las operaciones intermedias transforman un Stream en otro Stream. Estas operaciones son perezosas, lo que significa que no se ejecutan hasta que se invoca una operación terminal.

- **filter**: Filtra elementos basados en un predicado.
- **map**: Transforma cada elemento aplicando una función.
- **flatMap**: Transforma cada elemento en un Stream y aplana los resultados en un único Stream.
- **distinct**: Elimina elementos duplicados.
- **sorted**: Ordena los elementos.

### Operaciones Terminales

Las operaciones terminales producen un resultado o efecto secundario, y son las que inician el procesamiento de la secuencia de elementos.

- **forEach**: Realiza una acción sobre cada elemento.
- **collect**: Recolecta los elementos en una colección u otro contenedor.
- **reduce**: Reduce los elementos a un solo valor, aplicando repetidamente una operación binaria.
- **count**: Devuelve el número de elementos en el Stream.
- **findFirst**: Devuelve el primer elemento del Stream, si está presente.

## Ejemplo Práctico

A continuación, se muestra un ejemplo de cómo se pueden utilizar los Streams en Java para filtrar, mapear y recolectar una lista de enteros.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrar números pares, multiplicar por 2 y recolectar en una lista
        List<Integer> processedNumbers = numbers.stream()
                                                .filter(n -> n % 2 == 0)
                                                .map(n -> n * 2)
                                                .collect(Collectors.toList());

        // Imprimir la lista procesada
        System.out.println(processedNumbers);
    }
}

```
## Usos Avanzados de Java Streams
### 1. Streams Infinitos: 
Los Streams infinitos, o "infinite Streams", son Streams que no tienen un tamaño definido. Son útiles cuando queremos generar una secuencia de números o valores. 

```java
Stream.iterate(0, n -> n + 1)
     .limit(10)
     .forEach(System.out::println);
```

### 2. FlatMap: 
Se utiliza para transformar un Stream de colecciones en un Stream de elementos
```java
List<List<String>> lista = List.of(
  List.of("a", "b"),
  List.of("c", "d")
);

Stream<String> stream = lista.stream()
  .flatMap(Collection::stream);

stream.forEach(System.out::println);
```

### 3. Reduccion de Streams: 
Stream.reduce() es una operación terminal que se utiliza para reducir el contenido de un Stream a un único valor.
```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5);
Optional<Integer> resultado = numeros.stream().reduce(Integer::sum);
resultado.ifPresent(System.out::println); // imprime 15
```