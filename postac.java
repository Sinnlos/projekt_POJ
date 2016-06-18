package przebudzenie;

public abstract class Postac {
    
    String description = "Nieznany opis";
    
    public String getDescription(){
        
        return description;
    }
    
    public abstract String opis();
}
