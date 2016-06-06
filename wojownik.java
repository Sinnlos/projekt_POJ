package przebudzenie;

public class wojownik extends profesja {
	
	postac postac;
	
public wojownik(postac postac2) {
		// TODO Auto-generated constructor stub
	}

public void Wojownik(postac postac){
	
	this.postac = postac;
}

	public String getDescription(){
		
		return postac.getDescription() + ", Wojownik";
		
		}
	
	public String opis(){
	return "posiada cztery specjalne umiejętnosci: walka wręcz, walka mieczem, walka toporem oraz walka włócznią" + postac.opis();
	}
		
}

