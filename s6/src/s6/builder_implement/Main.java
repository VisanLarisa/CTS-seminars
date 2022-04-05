package s6.builder_implement;

public class Main {

	public static void main(String[] args) {
		
		User user=new User.UserBuilder("larisa", "larisa20", "lrs@gmail.com").address("bucharest").build();
	}
}
