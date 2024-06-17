import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String welcome = """
                =======Bienvenido a SWAPI App=======
                Eliga una de las siguientes opciones: 
                1. Elegir Pelicula (1-6)
                2. Salir
                Tu opcion es :
                """;
        List<Movie> movies = new ArrayList<>();
        ConsultaPelicula cs = new ConsultaPelicula();
        int op = 0;

        File file = new File("movies.json");
        FileWriter writer = new FileWriter(file);
        
        do {            
            System.out.println(welcome);
            op = sc.nextInt();
            if (op == 2) break;
            System.out.println("\nIngresa el ID de la pelicula: ");
            int id_movie = sc.nextInt();
            MovieSWAPI m = cs.buscarPelicula(id_movie);
            Movie myMovie = new Movie(m);
            System.out.println(myMovie);
            movies.add(myMovie);
        } while (true);

        GenerarJSON g = new GenerarJSON();
        g.save(movies);
        sc.close();
        writer.close();
    }
}
