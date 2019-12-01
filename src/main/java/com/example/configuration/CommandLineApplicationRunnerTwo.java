package com.example.configuration;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class CommandLineApplicationRunnerTwo implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(CommandLineApplicationRunnerTwo.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Command Line Application Runner Two runs just after application started.");
    }
}
