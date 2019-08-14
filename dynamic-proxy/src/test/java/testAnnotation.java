import com.yunsign.dao.UserDao;
import com.yunsign.dao.impl.UserDaoImpl;
import com.yunsign.proxy.UserDaoLogImpl;
import org.junit.Test;

public class testAnnotation {

	@Test
	public void testAnnotation(){
		UserDao userDao = new UserDaoLogImpl(new UserDaoImpl());
		userDao.query();
	}

}
