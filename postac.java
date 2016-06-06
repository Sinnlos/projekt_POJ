package przebudzenie;

public abstract class postac {
	
	String description = "Nieznany opis";
	
	public String getDescription(){
		
		return description;
	}
	
	public abstract String opis();
}