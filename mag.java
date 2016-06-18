package przebudzenie;

public class Mag extends Profesja {
    Postac postac;
    
    public Mag(Postac postac){
    
    this.postac = postac;
    }
    
    public String getDescription() {

        
        return postac.getDescription() +  ", Mag ";
        
        }       
    
    public String opis(){
        return " czarowanie, eliksiry"+ postac.opis();
        }


}
