package com.yunsign.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ComponentScan("com.yunsign")
@Configuration
@Profile("test1")
public class Appconfig {
}
