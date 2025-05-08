package com.example.stdaddress.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StdAddressConfig {
	@Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
