package przebudzenie;

public class Zbrojmistrz extends Profesja{
    Postac postac;
    
public Zbrojmistrz(Postac postac){
    
    this.postac = postac;
}

    public String getDescription(){
        
        return postac.getDescription() + ", Zbrojmistrz ";
        
        }
    

    public String opis(){
        return " naprawa ekwipunku" + postac.opis();
        }
    
}
