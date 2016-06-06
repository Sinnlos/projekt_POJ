package przebudzenie;

public abstract class lowca extends profesja{
	postac postac;
	
	public void Lowca(postac postac){
		
		this.postac = postac;
	}
	
		public String getDescription(){
		
		return postac.getDescription() + ", Łowca";
		
		}

	
	public String opis(){
		return "posiada dwie specjalne umiejętnosci: skradanie oraz strzelectwo" + postac.opis();
		}


}
