import com.yunsign.Entity.CityEntity;
import com.yunsign.config.Aopconfig;
import com.yunsign.dao.Dao;
import com.yunsign.dao.impl.IndexDao;
import com.yunsign.util.CommonUtil;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class testAnnotation {

	@Test
	public void testAnnotation(){
		CityEntity cityEntity = new CityEntity();
		CommonUtil.buildQuerySql(cityEntity);
	}

	@Test
	public void testAop(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext  = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Aopconfig.class);
		annotationConfigApplicationContext.refresh();
		Dao indexDao = (Dao)annotationConfigApplicationContext.getBean("indexDao");

		indexDao.query("hello");
	}
	@Test
	public void testAopz(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext  = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Aopconfig.class);
		annotationConfigApplicationContext.refresh();
		Dao indexDao = (Dao)annotationConfigApplicationContext.getBean("orderDao");

		indexDao.query("hello");
	}
	@Test
	public void testGenerateProxyClass(){
		byte [] bytes = ProxyGenerator.generateProxyClass("IndexDao",new Class[]{Dao.class});
		try {
			FileOutputStream fos = new FileOutputStream(new File("E:\\IndexDao.class"));
			fos.write(bytes);
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
