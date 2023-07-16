package br.com.alura.http2clientapi;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteHttp2 {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://www.casadocodigo.com.br"))
                .GET().build();
        HttpResponse<String> resp = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(resp.statusCode()); //Verificar se a requisição deu certo
        //System.out.println(resp.body()); //Quero ver o body (HTML) da página
        System.out.println(resp.version());
    }
}
