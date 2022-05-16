package chain;

public class Main {
	public static void main (String args[])
	{
		Order o1=new Order("Pizza", 15);
		Order o2=new Order("Coffee", 3);
		
		AHandler waiter=new Waiter();
		AHandler chief=new Chief();
		
		waiter.setSuccesor(chief);
		
		waiter.processOrder(o1);
		waiter.processOrder(o2);

	}
}
