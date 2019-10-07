package com.yunsign.imports;

import com.yunsign.dao.CardDao;
import com.yunsign.factory.MyFactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
		System.out.println(beanDefinition.getBeanClassName());
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.yunsign.dao.CardDao");
		beanDefinition.setBeanClass(MyFactoryBean.class);

		registry.registerBeanDefinition("cardDao",beanDefinition);
	}

}
