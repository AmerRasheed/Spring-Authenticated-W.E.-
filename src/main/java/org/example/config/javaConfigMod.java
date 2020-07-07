package org.example.config;


import org.example.data.AppUserInMemoryStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfigMod {

    @Bean
    public AppUserInMemoryStorage appUserInMemStorage(){
        return new AppUserInMemoryStorage();
    }
}
