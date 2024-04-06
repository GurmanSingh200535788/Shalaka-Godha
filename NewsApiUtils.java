package com.example.newsfinder;
// NewsApiUtils.java
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class NewsApiUtils {
    private static final String API_KEY = "ee470b30f76c47d3af7f1d9028c5ffb0";
    private static final String BASE_URL = "https://newsapi.org/v2/top-headlines";

    public static List<Article> getTopHeadlines(String country) {
        List<Article> articles = new ArrayList<>();

        try {
            URL url = new URL(BASE_URL + "?country=" + country + "&apiKey=" + API_KEY);
            System.out.println(url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                Gson gson = new Gson();
                articles = gson.fromJson(jsonObject.get("articles"), new ArrayList<Article>().getClass());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return articles;
    }
}