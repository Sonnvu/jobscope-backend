package com.learning.backend.service;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;

import org.json.JSONArray;
import org.json.JSONObject;

@Service
public class ProxyCurlRequestService {
    private static final String API_URL = "https://nubela.co/proxycurl/api/v2/linkedin/company/job";
    private static final String API_KEY = "YcjdkLfAH07G2c-fyApOtQ";

    public String getAllJobPostings(String keyword) {
        String encodedKeyword = URLEncoder.encode(keyword, StandardCharsets.UTF_8);

        String url = "https://nubela.co/proxycurl/api/v2/linkedin/company/job?keyword=" + encodedKeyword;
        HttpGet request = new HttpGet(url);
        request.setHeader("Authorization", "Bearer " + API_KEY);

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {

            HttpEntity entity = response.getEntity();
            String responseEntity = EntityUtils.toString(entity);
            System.out.println(responseEntity);

            JSONObject jsonObject = new JSONObject(responseEntity);
            return jsonObject.getString("next_page_api_url");

//            return EntityUtils.toString(entity);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getJobProfile() {
        String jobUrl = "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3904646858";
        String encodedJobUrl = URLEncoder.encode(jobUrl, StandardCharsets.UTF_8);

        String url = "https://nubela.co/proxycurl/api/linkedin/job?url=" + encodedJobUrl;
        HttpGet request = new HttpGet(url);
        request.setHeader("Authorization", "Bearer " + API_KEY);

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {

            HttpEntity entity = response.getEntity();
            String responseEntity = EntityUtils.toString(entity);

            JSONObject jsonObject = new JSONObject(responseEntity);
            // Process the response as needed
            return responseEntity;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getJobListingNextPage() {
        String url = "https://nubela.co/proxycurl/api/v2/linkedin/company/job?pagination=eyJwYWdlIjogMSwgIm1ldGhvZCI6ICJtYnJvd3NlciJ9&keyword=software+engineer&geo_id=92000000";
        HttpGet request = new HttpGet(url);
        request.setHeader("Authorization", "Bearer " + API_KEY);

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {

            HttpEntity entity = response.getEntity();
            String responseEntity = EntityUtils.toString(entity);
            System.out.println(responseEntity);

            JSONObject jsonObject = new JSONObject(responseEntity);
            return jsonObject.toString();

//            return EntityUtils.toString(entity);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
