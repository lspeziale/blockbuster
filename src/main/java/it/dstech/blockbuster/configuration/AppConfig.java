package it.dstech.blockbuster.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc //definisce il modulo MVC di Spring
@ComponentScan(basePackages = "it.dstech.spring")
public class AppConfig {

}
