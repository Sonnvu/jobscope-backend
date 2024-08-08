package com.learning.backend.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class RequestService {
    private static final String API_URL = "https://nubela.co/proxycurl/api/v2/linkedin/company/job";
    private static final String API_KEY = "YcjdkLfAH07G2c-fyApOtQ";

    public String getCompanyJobPostings(String keyword) {
        StringBuilder response = new StringBuilder();
        try {
            String encodedKeyword = URLEncoder.encode(keyword, StandardCharsets.UTF_8.toString());
            URL url = new URL(API_URL + "?keyword=" + encodedKeyword);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
            connection.setRequestProperty("Content-Type", "application/json");

            int responseCode = connection.getResponseCode();
            String responseErrorMessage = connection.getResponseMessage().toString();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
            } else {
                System.out.println("Failed to get LinkedIn comapany job posting. Response code: " + responseCode + " " + responseErrorMessage);
            }
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}

