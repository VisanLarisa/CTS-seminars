package command;

public class PastaOrder implements IOrder{
	private Chief chief;
	private String typePasta;
	
	
	
	public Chief getChief() {
		return chief;
	}



	public void setChief(Chief chief) {
		this.chief = chief;
	}



	public String getTypePasta() {
		return typePasta;
	}



	public void setTypePizza(String typePizza) {
		this.typePasta = typePizza;
	}



	public PastaOrder(Chief chief, String typePasta) {
		super();
		this.chief = chief;
		this.typePasta = typePasta;
	}



	@Override
	public void processOrder() {
		this.chief.cookPizza(this.typePasta);
	}
}
