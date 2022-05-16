package command;

public class Main {

	private static void main(String args[])
	{
		Chief c1=new Chief ("Michael");
		Chief c2=new Chief("Rode");
		
		Waiter waiter=new Waiter();
		waiter.noteOrder(new PizzaOrder(c1, "diavola"));
		waiter.noteOrder(new PastaOrder(c2, "carbonara"));
		waiter.noteOrder(new PizzaOrder(c2, "margherita"));
		
		waiter.sendOrder();
	}
}
