package com.yunsign.config;

import com.yunsign.annotation.EnableYunsign;
import com.yunsign.annotation.YunsignScan;
import com.yunsign.imports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan("com.yunsign")
@Configuration
@YunsignScan
@EnableYunsign("test")
public class Appconfig {
}
