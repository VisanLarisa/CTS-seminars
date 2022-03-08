package eu.ase.en.solid.o.resolved;

public class FteEmployee extends Employee{

	public FteEmployee(int id, String name, float salary) {
		super(id, name, salary);
	}
	@Override
	public float calculateBonus() {
		// TODO Auto-generated method stub
		return this.getSalary();
	}
	
}
