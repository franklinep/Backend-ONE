import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.Gson;


import com.google.gson.GsonBuilder;

public class ConversorMoneda {
    public double convertir(String base, String base_code, String target_code) throws IOException, InterruptedException{
        URI url = URI.create("https://v6.exchangerate-api.com/v6/3965c15f3c4dd068c811c2c2/pair/"+base_code+"/"+target_code);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(url)
        .build();

        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString()); 

        Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();

        //  json object --> Java Object
        String json = response.body();
        Conversor c = gson.fromJson(json, Conversor.class);
        
        return Double.parseDouble(base)*c.getConversionRate();
    }
}
