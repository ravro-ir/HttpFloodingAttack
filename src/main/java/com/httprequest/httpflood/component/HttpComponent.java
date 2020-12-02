package com.httprequest.httpflood.component;

import com.httprequest.httpflood.service.HttpService;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class HttpComponent {

    private final HttpService httpService;

    public HttpComponent(HttpService httpService) {
        this.httpService = httpService;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void OnStart() throws InterruptedException, UnsupportedEncodingException {

        for (int i = 1000; i <= 10000; i++) {
            httpService.runBeforeAllTestMethods(i);
        }
    }
}
