import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GenerarJSON{
    // .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) --> Renombra los campos de mi objeto a ese formato para la salida
    Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

    public void save(List<Movie> movies) throws IOException{
        File file = new File("movies.json");
        FileWriter writer = new FileWriter(file);           
        writer.write(gson.toJson(movies));    
        writer.close();
    }
}
