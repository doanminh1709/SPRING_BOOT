package com.example.btvnb7.Config;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
           modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
           return modelMapper;
    }
}
