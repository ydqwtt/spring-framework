import com.yunsign.dao.UserDao;
import com.yunsign.dao.impl.UserDaoImpl;
import com.yunsign.proxy.UserDaoLogImpl;
import com.yunsign.proxy.YunsignInvocationHandler;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class testAnnotation {

	@Test
	public void testAnnotation(){
//		UserDao userDao = new UserDaoLogImpl(new UserDaoImpl());
//		userDao.query();

		UserDao userDao = (UserDao) Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{UserDao.class},
				new YunsignInvocationHandler(new UserDaoImpl()));
		userDao.query();
	}

}
