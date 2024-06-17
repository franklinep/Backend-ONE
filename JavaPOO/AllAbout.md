# ¿Que es una API?
Una API es una interfaz de programacion de aplicaciones que nos permite interactuar con servicios web y obtener datos de manera estructurada.
API   (Application Programming Interface)   es un conjunto de estándares, protocolos y herramientas para construir software y aplicaciones. Una API permite que diferentes sistemas y servicios se comuniquen e intercambien información de forma estandarizada. Existen diferentes tipos de API, la más común es la API web, que utiliza el protocolo HTTP para la comunicación a través de Internet.

Un ejemplo de uso de API es la integración de un sistema de ventas con un sistema de gestión financiera. A través de una API, los datos de ventas se pueden enviar automáticamente al sistema financiero, evitando la necesidad de ingresarlos manualmente y reduciendo el riesgo de errores. Otro ejemplo es el uso de una API para integrar una aplicación móvil con un servicio web, para sincronizar y almacenar información del usuario.

## OMDb API
Usaremos OMDb API, el cual vamos a conectar nuestra aplicacion ScreenMatch con OMDb para obtener datos de peliculas y series. [OMDb](https://www.omdbapi.com/)

~~~
apikey=397f3b3b
~~~

# JSON
JSON (JavaScript Object Notation) es un formato de datos ligero y popular para intercambiar información entre sistemas y se puede utilizar en varios lenguajes de programación.

JSON se compone de dos tipos de estructuras de datos: `objetos` y `arrays`. Un `objeto` es una colección de pares clave-valor, donde las claves son strings y los valores pueden ser strings, números, booleanos, objetos o arrays. Por ejemplo:

~~~json
{
  "nombre": "Juan",
  "edad": 30,
  "soltero": false,
  "direccion": {
    "calle": "San Luis 123",
    "ciudad": "Mendoza",
    "provincia": "Mendoza"
  },
  "telefonos": [
    "1111-1111",
    "2222-2222"
  ]
}
~~~
Un `array` es una colección ordenada de valores, que pueden ser strings, números, booleanos, objetos u otros arrays. Por ejemplo:
~~~json
[
  {
    "nombre": "Juan",
    "edad": 30
  },
  {
    "nombre": "Maria",
    "edad": 25
  },
  {
    "nombre": "Bruno",
    "edad": 40
  }
]
~~~

JSON es muy utilizado en aplicaciones, independientemente del lenguaje de programación utilizado, para enviar y recibir datos de APIs, y para ello se recomienda utilizar una biblioteca que permita la `serialización` (conversión de objetos a JSON) y la `deserialización` (conversión de JSON en objetos).

## POSTMAN

## HTTP
HTTP (HyperText Transfer Protocol) es un `protocolo de comunicación` que permite la transferencia de información en Internet. 
HTTP se desarrolló en la década de 1990 y se basa en un `modelo cliente-servidor`, donde un cliente (navegador web) realiza solicitudes a un servidor para obtener información y el servidor responde con los datos solicitados. HTTP utiliza `TCP` (Transmission Control Protocol) como protocolo de transporte para garantizar una entrega de datos confiable.
HTTP utiliza `métodos` para especificar el tipo de operación que se debe realizar en el servidor. Los métodos principales son GET, POST, PUT y DELETE.

HTTP utiliza `códigos de status` para indicar el resultado de la operación realizada. Los códigos de status van del 100 al 599 y se dividen en cinco clases:

* 1xx: Informaciones
* 2xx: Éxito
* 3xx: Redirección
* 4xx: error del cliente
* 5xx: error del servidor

# Patrones de Diseño

Los patrones de diseño, también conocidos como design patterns, son soluciones reutilizables a problemas comunes de desarrollo de software. Surgieron en la década de 1990, cuando un grupo de desarrolladores identificó que muchos proyectos de software presentaban problemas similares, que podían resolverse con soluciones similares.

Los patrones de diseño se pueden dividir en tres categorías:

* Patrones de creación: son patrones que se ocupan de la creación de objetos, con el objetivo de garantizar la flexibilidad y la reutilización del código. Algunos ejemplos de patrones de creación son: Factory Method, Builder y Singleton.
* Patrones de estructura: son patrones que tratan de la organización de objetos en estructuras más grandes, buscando simplificar la comunicación entre objetos y reducir el acoplamiento entre ellos. Algunos ejemplos de patrones de estructura son: Adapter, Facade y Composite.
* Patrones de comportamiento: son patrones que tratan la comunicación entre objetos, buscando definir el comportamiento esperado en situaciones específicas. Algunos ejemplos de patrones de comportamiento son: Observer, Command y Strategy.

Al utilizar patrones de diseño, es posible aumentar la calidad del código, haciéndolo más legible, flexible y fácil de mantener.

Articulo recomendado: [Patrones](https://unpocodejava.com/2013/01/02/un-poco-de-patrones-de-diseno-gof-gang-of-four/)
