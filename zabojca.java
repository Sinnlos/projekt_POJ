package przebudzenie;

public class zabojca extends profesja {
	postac postac;
	
public void Zabojca(postac postac){
	
	this.postac = postac;
}

	public String getDescription(){
		
		return postac.getDescription() + ", Zabójca";
		
		}

	
	public String opis(){
		return"posiada trzy specjalne umiejętnosci: skradanie, trucizny oraz walka wręcz" + postac.opis();
		}


}
