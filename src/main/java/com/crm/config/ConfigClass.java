package com.crm.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class ConfigClass {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
