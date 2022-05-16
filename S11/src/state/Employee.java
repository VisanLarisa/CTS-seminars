package state;

import javax.naming.OperationNotSupportedException;

public class Employee {
	IState currentState;
	
	public Employee() {
		super();
	}

	public Employee(IState currentState) {
		super();
		this.currentState = currentState;
	}

	public IState getCurrentState() {
		return currentState;
	}

//	public void setCurrentState(IState currentState) {
//		this.currentState = currentState;
//	}
//	
	public void setState(EState state) throws OperationNotSupportedException
	{
		switch(state)
		{
			case WORKING:
				this.currentState=new WorkingState();
				break;
			case VACANTION:
				this.currentState=new VacantionState();
				break;
			case BREAK:
				this.currentState=new AwayState();
				break;
			default: {
				throw new OperationNotSupportedException();
			}
		}
		
	}
	
	public void act(String task)
	{
		this.currentState.action(task);
	}
}
