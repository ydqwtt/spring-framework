package method.injection.Impl;

import method.injection.CreateContract;
import method.injection.SignContract;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 使用ApplicationContextAware  实现对singleton 方法调用prototype时，原型失效问题
 */
@Service("signContract")
public class SignContractImpl implements SignContract, ApplicationContextAware{

	private ApplicationContext applicationContext;

	@Autowired
	private CreateContract createContract;

	@Override
	public void sign() {
//		System.out.println("signContract.hashCode()==="+this.hashCode());
//		createContract =  applicationContext.getBean("createContract",CreateContract.class);
		System.out.println("createContract1.hashCode()==="+applicationContext.getBean("createContract",CreateContract.class).hashCode());

		CreateContract createContract2 =  applicationContext.getBean("createContract",CreateContract.class);
		System.out.println("createContract2.hashCode()==="+createContract2.hashCode());
		System.out.println("createContract3.hashCode()==="+createContract.hashCode());
//		createContract.createContract();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
