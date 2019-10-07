package com.yunsign.config;

import com.yunsign.annotation.YunsignScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.yunsign")
@Configuration
@YunsignScan
public class Appconfig {
}
