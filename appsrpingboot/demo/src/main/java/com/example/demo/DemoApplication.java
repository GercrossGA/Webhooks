package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class DemoApplication {

    @Value("${APP_GREETING:Hola}")
    private String greeting;

    @Value("${APP_ENVIRONMENT_INFO:}")
    private String envInfo;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF); // Apaga el dibujo de Spring
        app.run(args);
	}

	@Bean
    public CommandLineRunner commandLineRunner() {
        return args -> { 
            System.out.println("************************");
            System.out.println(greeting); 
            if (!envInfo.isEmpty()) {
                System.out.println(envInfo);
            }
            System.out.println("************************");
        };
    }
}
