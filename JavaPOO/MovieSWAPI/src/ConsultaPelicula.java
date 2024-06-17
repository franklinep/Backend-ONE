import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConsultaPelicula {

    public MovieSWAPI buscarPelicula(int id){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        
        URI url = URI.create("https://swapi.dev/api/films/"+ id + "/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(url)
            .build();

        try {
            HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());
            //System.out.println(response.body());
            //System.out.println(movieSWAPI);
            return gson.fromJson(response.body(), MovieSWAPI.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } 

    }
}
