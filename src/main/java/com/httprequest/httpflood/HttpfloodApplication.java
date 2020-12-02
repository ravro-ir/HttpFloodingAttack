package com.httprequest.httpflood;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HttpfloodApplication {

    public static void main(String[] args) {
        // SpringApplication.run(HttpfloodApplication.class, args);
        SpringApplication app = new SpringApplication(HttpfloodApplication.class);
        app.setAddCommandLineProperties(false);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
