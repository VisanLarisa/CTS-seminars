package state;

import javax.naming.OperationNotSupportedException;

public class Main {

	public static void main(String[] args) throws OperationNotSupportedException {
		
		Employee employee = new Employee();
		employee.setState(EState.WORKING);
		
		employee.act("Excel");
		employee.setState(EState.VACANTION);
		employee.act("Server down");
		
	}

}
