package przebudzenie;

public class zbrojmistrz extends profesja{
	postac postac;
	
public zbrojmistrz(postac postac2) {
		// TODO Auto-generated constructor stub
	}

public void Zbrojmistrz(postac postac){
	
	this.postac = postac;
}

	public String getDescription(){
		
		return postac.getDescription() + ", Zbrojmistrz";
		
		}
	

	public String opis(){
		return " posiada jedną specjalną umiejętnosć: naprawa ekwipunku" + postac.opis();
		}
	
}
