# Teoría de `Optional` en Java

## Introducción

El tipo de dato `Optional` en Java se introdujo en Java 8 como una solución para manejar valores que pueden estar presentes o ausentes, evitando el uso de valores nulos (`null`) y reduciendo así los errores relacionados con el manejo de nulos, como los famosos `NullPointerException`.

## ¿Qué es un `Optional`?

Un `Optional` es un contenedor que puede o no contener un valor no nulo. Ofrece una alternativa a los valores nulos y proporciona métodos para trabajar con valores presentes y ausentes de manera más segura y expresiva.

## Características Clave

1. **Evita el uso de `null`**: Proporciona una forma explícita de indicar la ausencia de un valor.
2. **Métodos de manejo seguro**: Ofrece métodos para trabajar con el valor presente, si existe, sin necesidad de realizar comprobaciones explícitas de `null`.
3. **Expresividad**: Hace que el código sea más claro y expresivo sobre la presencia o ausencia de valores.

## Creación de un `Optional`

### Métodos de creación

- **empty**: Crea un `Optional` vacío.
- **of**: Crea un `Optional` con un valor no nulo.
- **ofNullable**: Crea un `Optional` que puede contener un valor nulo o no nulo.

```java
Optional<String> emptyOptional = Optional.empty();
Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
Optional<String> nullableOptional = Optional.ofNullable(null);
```

# Operaciones comunes

## Verificar si hay un valor presente

+ isPresent: Devuelve true si el Optional contiene un valor, false si está vacío.
+ ifPresent: Ejecuta una acción si el valor está presente.
```java
Optional<String> optional = Optional.of("Hello");

if (optional.isPresent()) {
    System.out.println(optional.get());
}

// Usando ifPresent
optional.ifPresent(value -> System.out.println(value));
```
## Obtener el valor

+ get: Devuelve el valor si está presente, de lo contrario lanza NoSuchElementException.
+ orElse: Devuelve el valor si está presente, de lo contrario devuelve un valor predeterminado.
+ orElseGet: Devuelve el valor si está presente, de lo contrario ejecuta una función suministrada y devuelve su resultado.
+ orElseThrow: Devuelve el valor si está presente, de lo contrario lanza una excepción suministrada.
```java
Optional<String> optional = Optional.of("Hello");

String value1 = optional.get();
String value2 = optional.orElse("Default Value");
String value3 = optional.orElseGet(() -> "Generated Default Value");
String value4 = optional.orElseThrow(() -> new RuntimeException("Value not present"));
```

## Transformar el valor
+ map: Aplica una función al valor si está presente y devuelve un Optional con el resultado.
+ flatMap: Similar a map, pero aplana el resultado a un solo Optional.
```java
Optional<String> optional = Optional.of("Hello");

// Usando map
Optional<Integer> lengthOptional = optional.map(String::length);

// Usando flatMap
Optional<Integer> flatMappedOptional = optional.flatMap(value -> Optional.of(value.length()));
```


```java
Optional<String> optional = Optional.of("Hello");

if (optional.isPresent()) {
    System.out.println(optional.get());
}

// Usando ifPresent
optional.ifPresent(value -> System.out.println(value));
```