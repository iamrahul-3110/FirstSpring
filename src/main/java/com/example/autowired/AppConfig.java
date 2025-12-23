package com.example.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.autowired") // xml to annotation transition
public class AppConfig {
}
