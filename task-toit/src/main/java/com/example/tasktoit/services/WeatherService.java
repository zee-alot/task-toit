package com.example.tasktoit.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class WeatherService {

    private static String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={BERLIN}&appid={327dbcf8bc99f7bb3cc0285254b213da}";
    private static String apiKey = "327dbcf8bc99f7bb3cc0285254b213da";

    public void getWeather() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = httpResponse.statusCode();
        String responseBody = httpResponse.body();

    }
}
