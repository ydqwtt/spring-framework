package com.yunsign.annotation;

import com.yunsign.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})//表示可以作用在哪里
@Retention(RetentionPolicy.RUNTIME)//表示注解在运行时存在
@Import(MyImportSelector.class)

public @interface EnableYunsign {
	String value() default "";
}
