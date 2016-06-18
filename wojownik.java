package przebudzenie;

public class Wojownik extends Profesja {
    
    Postac postac;
    

public Wojownik(Postac postac){
    
    this.postac = postac;
}

    public String getDescription(){
        
        return postac.getDescription() + ", Wojownik ";
        
        }
    
    public String opis(){
    return " walka wręcz, walka mieczem, walka toporem, walka włócznią" + postac.opis();
    }
        
}
