package eu.ase.en.solid.s;

public interface iUser {
	boolean login(String username, String password);
	boolean register (String username, String email, String password);
	//void LogError (String error);
	//void sendEmail (String content, String email); ar trebui duse altundeva
}
