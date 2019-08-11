package method.injection.Impl;

import method.injection.CreateContract;
import method.injection.SignContract;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 使用lookup  实现对singleton 方法调用prototype时，原型失效问题
 * InitializingBean bean 初始化后执行
 */
@Service("signContract2")
public class SignContractImpl2 implements SignContract, InitializingBean {

	public SignContractImpl2() {
		System.out.println("构造函数");
	}

	@Lookup("createContract")
	public CreateContract getCreateContract() {
		return null;
	}

//	private CreateContract createContract;

	@Override
	public void sign() {

		System.out.println("createContract2.hashCode()==="+getCreateContract().hashCode());
		System.out.println("createContract3.hashCode()==="+getCreateContract().hashCode());
//		createContract.createContract();
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	@PostConstruct
	public void init(){
		System.out.println("init method !");
	}
}
