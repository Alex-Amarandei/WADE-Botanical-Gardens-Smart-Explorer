package fii.wade.botaniq.sparql.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class SparqlService {

    public String sendGetRequest(String endpoint, String term) throws IOException {
        term = term.replace(" ", "%20");
        String url = "https://d6zvsusuaeamca3l34xqyr7dz40tkyzx.lambda-url.eu-central-1.on.aws/?term=" + term + "&endpoint=" + endpoint;
        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
                response.append("\n");
            }
            in.close();

            return response.toString();
        } else {
            throw new IOException("GET request failed. Response Code: " + responseCode);
        }
    }
}
