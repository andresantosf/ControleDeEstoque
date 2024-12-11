package com.estoque.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;


@Configuration
public class AWSConfig {
    

    @Bean
    public AmazonS3 createS3Istance(){
        return AmazonS3ClientBuilder
        .standard()
        .withRegion("us-east-1")
        .build();
    };
}
