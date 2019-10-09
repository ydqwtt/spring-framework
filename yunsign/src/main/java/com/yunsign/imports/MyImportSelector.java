package com.yunsign.imports;

import com.yunsign.dao.impl.IndexDao2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//将返回IndexDao2对象在Spring容器中的对象
		return new String[]{IndexDao2.class.getName()};
	}
}
