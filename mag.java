package przebudzenie;

public class mag extends profesja {
	postac postac;
	
	public mag(postac postac2) {
		// TODO Auto-generated constructor stub
	}

	public void Mag(postac postac){
	
	this.postac = postac;
}

	public String getDescription(){
		
		return postac.getDescription() + ", Mag";
		
		}		
	
	public String opis(){
		return " posiada dwie specjalne umiejętnosci: czarowanie oraz eliksiry" + postac.opis();
		}


}
