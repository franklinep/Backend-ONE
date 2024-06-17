# Teoría de `DoubleSummaryStatistics` e `IntSummaryStatistics` en Java

## Introducción

`DoubleSummaryStatistics` e `IntSummaryStatistics` son clases de utilidad en Java que se introdujeron en Java 8 como parte del paquete `java.util`. Estas clases se utilizan para recopilar estadísticas descriptivas (como el recuento, suma, mínimo, máximo y promedio) sobre una secuencia de valores primitivos (dobles y enteros, respectivamente).

## `DoubleSummaryStatistics`

### Descripción

`DoubleSummaryStatistics` es una clase que permite recopilar estadísticas sobre una secuencia de valores `double`. Esta clase se usa comúnmente con Streams para realizar cálculos estadísticos de manera eficiente y conveniente.

### Métodos Principales

- **accept(double value)**: Registra un nuevo valor en el resumen de estadísticas.
- **combine(DoubleSummaryStatistics other)**: Combina otro objeto `DoubleSummaryStatistics` con este.
- **getCount()**: Devuelve el número de valores registrados.
- **getSum()**: Devuelve la suma de todos los valores registrados.
- **getMin()**: Devuelve el valor mínimo registrado.
- **getMax()**: Devuelve el valor máximo registrado.
- **getAverage()**: Devuelve el promedio de los valores registrados.

### Ejemplo Práctico

```java
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class DoubleSummaryStatisticsExample {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.5, 2.3, 3.7, 4.6, 5.0);

        DoubleSummaryStatistics stats = doubleStream.summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
    }
}
```

## `IntSummaryStatistics`

IntSummaryStatistics es una clase que permite recopilar estadísticas sobre una secuencia de valores int. Similar a DoubleSummaryStatistics, esta clase se usa comúnmente con Streams para realizar cálculos estadísticos.

Ejemplo Practico: 
```java
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatisticsExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        IntSummaryStatistics stats = intStream.summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
    }
}

```