package en.ase.classes;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils instance= new Utils();
		Integer[] array= {0, 2, 3, 4, -2, 0, 5, -2, 2};
		System.out.println("number of aparitions of the minimum number "+instance.aparitii(array));
	}

}
