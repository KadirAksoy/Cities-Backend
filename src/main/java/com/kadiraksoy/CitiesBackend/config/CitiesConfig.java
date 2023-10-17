package com.kadiraksoy.CitiesBackend.config;


import com.kadiraksoy.CitiesBackend.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class CitiesConfig {

    private final CityService cityService;

    @Bean
    public CommandLineRunner run(){
        return args -> {
            String csvFileName = "cities.csv";
            cityService.readAndSaveCsvFile(csvFileName);
        };
    }
}
