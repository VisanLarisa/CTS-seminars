package en.ase.classes;

public class Utils {
//	Integer[] array=new Integer;
	
	int aparitii(Integer[] array) {
		int min=array[0];
		int apar=0;
		for(int i=0; i<array.length; i++)
		{	
		
			if(array[i]<min)
				{
					min=array[i];
					apar=0;
				}
			if(array[i]==min)
				{
					apar++;
				}
		}
		
		System.out.println("the minimum element is "+min);
		return apar;
	}
}
