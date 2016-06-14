import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

package przebudzenie;

public class kreatorPostaci {


public static void main(String args []){
		
		postac postac = new elf();
		postac = new mag(postac);
	
		
		postac postac2 = new krasnolud();
		postac2 = new zbrojmistrz(postac2);
		postac2 = new wojownik(postac2);
		System.out.println(postac2.getDescription() + postac2.opis());
	
	 PrintWriter zapis = new PrintWriter("postac.txt");
	      zapis.println(postac2.getDescription() + postac2.opis());
	      zapis.close();
		
	}
	
}
