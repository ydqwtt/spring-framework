package com.yunsign.annotation;

import com.yunsign.imports.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})//表示可以作用在哪里
@Retention(RetentionPolicy.RUNTIME)//表示注解在运行时存在
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface YunsignScan {
}
