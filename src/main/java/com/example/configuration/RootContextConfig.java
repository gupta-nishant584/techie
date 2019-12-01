package com.example.configuration;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RootContextConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setContextPath("/spring-boot-learning");
    }

    // we can do the same thing using following ways.

    // 1.  application.properties (server.servlet.context-path = /spring-boot-learning)
    //2. java -jar -Dserver.servlet.context-path = /spring-boot-learning springbootmanagement.jar
}
