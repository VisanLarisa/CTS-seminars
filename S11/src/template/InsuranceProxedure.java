package template;

public class InsuranceProxedure extends AInsuranceProceduere {

	@Override
	protected void identifyDamage() {
		// TODO Auto-generated method stub
		System.out.println("I am identifying the isuue");
	}

	@Override
	protected void evaluateDamage() {
		// TODO Auto-generated method stub
		System.out.println("I am evaluating the isuue");

	}

	@Override
	protected void sendInsurance() {
		System.out.println("I am sending the insurance");
		
	}

}
