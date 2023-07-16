package br.com.alura.http2clientapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TesteHttp1 {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.casadocodigo.com.br");
        URLConnection uc = url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));

        String line;
        StringBuilder content = new StringBuilder();

        while ((line = br.readLine()) != null) {
            content.append(line).append(System.lineSeparator());
        }

        br.close();

        System.out.println(content.toString());
    }
}

