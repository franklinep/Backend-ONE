package com.one.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {
    
    public String obtenerDatos(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }
}

/*

List<Camisa> camisas  = …
    
    CamisaPredicate rojas  = new CamisaPredicate() {   
        public boolean test(Camisa camisa){    
            return "ROJO".equals(camisa.getColor());
        }    
    }; 
    
    CamisaPredicate rojasXL = new CamisaPredicate() {  
        public boolean test(Camisa camisa){     
            return “ROJO”.equals(camisa.getColor())  && “XL”.equals(camisa.getTalla());
        }    
    }; 
    
    List<Camisa> camisasRojas = filtrar(camisas,  rojas); List<Camisa> camisasRojasXL  = filtrar(camisas, rojasXL);

 */
