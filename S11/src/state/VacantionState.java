package state;

public class VacantionState implements IState{

	@Override
	public void action(String task) {
		System.out.println("this emp is in vacantion and can't do this task: "+task);
	}
}
