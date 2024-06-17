import com.google.gson.annotations.SerializedName;

public class Movie {
    private String titulo;
    private String director;
    private String productor;
    @SerializedName("Fecha de Lanzamiento")
    private String fechaDeLanzamiento;
    
    public Movie(MovieSWAPI mswapi){
        this.titulo = mswapi.title();
        this.director = mswapi.director();
        this.productor = mswapi.producer();
        this.fechaDeLanzamiento = mswapi.release_date();
    }
    
    @Override
    public String toString() {
        return "++++++++Pelicula Agregada++++++++" +
        "\nTitulo: " + this.titulo +
        "\nDirector: " + this.director + 
        "\nProductor: " + this.productor +
        "\nFecha de Lanzamiento: " + this.fechaDeLanzamiento + "\n";  
    }
}
