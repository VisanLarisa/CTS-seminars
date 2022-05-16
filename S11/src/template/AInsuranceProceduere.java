package template;

public abstract class AInsuranceProceduere {

	//pasi cu ordine clara:
	protected abstract void identifyDamage();

	protected abstract void evaluateDamage();
	
	protected abstract void sendInsurance();

	public void giveInsurance()
	{
		identifyDamage();
		evaluateDamage();
		sendInsurance();
	}	
}
