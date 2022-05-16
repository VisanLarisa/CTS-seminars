package state;

public class WorkingState implements IState {

	@Override
	public void action(String task) {
		System.out.println("This employee work on this task: "+task);
	}

}
