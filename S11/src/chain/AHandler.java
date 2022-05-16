package chain;

public abstract class AHandler {
	protected AHandler succesor=null; //un succcesor de acelasi tip

	public abstract void processOrder(Order o);
	public void setSuccesor(AHandler succesor)
	{
		this.succesor=succesor;
	}
}
