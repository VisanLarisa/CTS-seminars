package command;

public class Chief {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void cookPizza(String typePizza)
	{
		System.out.println("this Chief "+name+" is cooking "+typePizza);
	}
	
	public void cookPasta(String typePasta)
	{
		System.out.println("this Chief "+name+" is cooking "+typePasta);
	}

	public Chief(String name) {
		super();
		this.name = name;
	}
	
	
}
