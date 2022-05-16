package state;

public class AwayState implements IState {

	@Override
	public void action(String task) {
		System.out.println("this employeee will prioritize this task: "+task);
	}

}
