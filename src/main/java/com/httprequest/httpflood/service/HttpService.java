package com.httprequest.httpflood.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpService {

    @Async("dbTasks")
    public void runBeforeAllTestMethods(int j) throws InterruptedException {

        String url = "YOUR URL";
        RestTemplate restTemplate = new RestTemplate();
        String requestJson = "YOUR JSON BODY";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.set("x-app-version", "5.0.1");
        headers.set("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.75 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);

        try {
            System.out.println("Counter is : " + j);
            String answer = restTemplate.postForObject(url, entity, String.class);
            assert answer != null;
            if (!answer.contains("errors")) {
                System.out.println(answer);
                Thread.sleep(30000);
            }
        } catch (Exception e) {
            Thread.sleep(10);
            System.out.println(e.getMessage());
        }
    }
}
