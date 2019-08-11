package com.yunsign.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

@ComponentScan("com.yunsign")
@Configuration
//@Profile("test1")
/**
 * proxyTargetClass=true使用cglib代理，false为jdk动态代理 默认为false
 */
@EnableAspectJAutoProxy(proxyTargetClass = false)

public class Aopconfig {
}
