package com.example.configuration;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class CommandLineApplicationRunner implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(CommandLineApplicationRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Command Line Application Runner runs just after application started.");
    }

    //This piece of code will be run exactly once in application lifetime. just after application start up.

}
