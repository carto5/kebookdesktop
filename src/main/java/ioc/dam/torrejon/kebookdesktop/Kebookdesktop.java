/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ioc.dam.torrejon.kebookdesktop;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedHashMap;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author carlo
 */
public class Kebookdesktop {

    public static void main(String[] args) throws IOException, InterruptedException {
        
//        HttpClient cliente = HttpClient.newHttpClient();
//        
//        
//        /*HttpRequest solicitud = HttpRequest.newBuilder(URI.create("http://localhost:8080/login/carlos@gmail.com/carlos")).GET()
//                .build();
//        
//        HttpResponse respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
//        
//        System.out.println(respuesta.body());*/
//        
//          LinkedHashMap<String, String> values = new LinkedHashMap<String, String>() {{
//                
//            put("nombre", "dani");
//            put ("correo", "dani@gmail.com");
//            put ("contrasena", "dani");
//            put ("fecha_creacion","2022-10-31");
//            put ("isAdmin","0");
//            
//        }};
//
//        var objectMapper = new ObjectMapper();
//        String requestBody = objectMapper
//                .writeValueAsString(values);
//
//        HttpClient client = HttpClient.newHttpClient();
//        
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://localhost:8080/usuario"))
//                .header("Content-Type", "application/json")
//                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
//                .build();
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(requestBody);
//        System.out.println(response.headers());
    }
}
