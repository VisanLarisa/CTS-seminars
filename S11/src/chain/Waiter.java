package chain;

public class Waiter extends AHandler{

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty()>5)
		{
			System.out.println("Waiter can not handle this: "+o.getName());
			this.succesor.processOrder(o);	//succesor protected
		}
		else
			System.out.println("Waiter is handling this: "+o.getName());
	}

}
