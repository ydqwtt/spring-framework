package method.injection.Impl;

import method.injection.CreateContract;
import method.injection.SignContract;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 使用lookup  实现对singleton 方法调用prototype时，原型失效问题
 */
@Service("signContract2")
public class SignContractImpl2 implements SignContract{

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


}
