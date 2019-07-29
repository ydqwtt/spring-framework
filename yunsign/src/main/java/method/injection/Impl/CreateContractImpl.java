package method.injection.Impl;

import method.injection.CreateContract;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("createContract")
//@Scope("prototype")
public class CreateContractImpl implements CreateContract {

	public CreateContractImpl() {
//		System.out.println("createContract0.hashCode()==="+this.hashCode());
	}

	@Override
	public void createContract() {
		System.out.println("createContract.hashCode()==="+this.hashCode());
	}
}
