/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioc.dam.torrejon.call;

import ioc.dam.torrejon.model.Usuario;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedHashMap;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 * @author carlo
 */
public class Calls {

    public void userLogin(String url) throws IOException, InterruptedException {

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest solicitud = HttpRequest.newBuilder(URI.create(url)).GET()
                .build();

        HttpResponse respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        System.out.println(respuesta.body());

    }

    public void registrarUsuario(LinkedHashMap<String, String> values) throws IOException, InterruptedException {

        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(values);

        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/usuario"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        
        

    }

}
