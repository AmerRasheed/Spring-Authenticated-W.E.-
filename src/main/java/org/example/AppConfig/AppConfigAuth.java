package org.example.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan (basePackages = "org.example")
public class AppConfigAuth {


    // Declaring another bean
    @Bean                                       //Annotation as Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

}
