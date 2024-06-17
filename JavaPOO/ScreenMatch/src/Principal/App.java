package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Modelos.Pelicula;
import Modelos.Serie;
import Modelos.Titulo;
import java.lang.String;

public class App {
    public static void main(String[] args) throws Exception {
        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        List<Titulo> lista = new ArrayList<>();
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: " + pelicula.getClasificacion());
            }
        }

        // Si se realiza System.out.println(lista), Java utiliza el método toString() de cada elemento de la lista 
        // para imprimir su representación en forma de cadena de texto.
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista de Titulos Ordenada: " + lista);

        // Podemos ordenar nuestra lista utilizando el meotod sort de la clase ArrayList 
        // Utilizamos como parametro una expresion lambda
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        // ====================================
    }
}
