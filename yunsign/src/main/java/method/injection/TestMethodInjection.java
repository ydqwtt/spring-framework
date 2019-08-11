package method.injection;

import com.yunsign.config.MethodInjectionAppconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestMethodInjection {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(MethodInjectionAppconfig.class);
		annotationConfigApplicationContext.refresh();
//		ReentrantLock lock = new ReentrantLock(true);
//		lock.lock();
//		SignContract signContract = (SignContract) annotationConfigApplicationContext.getBean("signContract2");
//		signContract.sign();

//		CreateContract createContract = (CreateContract) annotationConfigApplicationContext.getBean("createContract");
//		System.out.println("createContract.hashCode()==="+createContract.hashCode());
	}

}
