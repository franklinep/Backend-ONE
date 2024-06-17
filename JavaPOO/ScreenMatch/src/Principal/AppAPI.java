package Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class AppAPI  {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        String API_KEY = "&apikey=397f3b3b";
        System.out.println("Ingrese el nombre de la pelicula a buscar: ");
        String pelicula = sc.nextLine();
        String url = "http://www.omdbapi.com/?t=" + pelicula + API_KEY;
        
        // Instanciamos el cliente que realizara las request
        HttpClient client = HttpClient.newHttpClient();
        // Instanciamos el request que se enviara al servidor
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
        // Instanciamos la respuesta obtessnida 
        HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        
        System.out.println(response.body());
        Gson gson = new Gson();
        sc.close();
    }
    
}
