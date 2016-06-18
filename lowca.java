package przebudzenie;

public class Lowca extends Profesja{
    Postac postac;
    
    public Lowca(Postac postac){
        
        this.postac = postac;
        
    }
        
        public String getDescription() {
    
        return postac.getDescription() +  ", Łowca ";
        
        }

    
    public String opis(){
        return " skradanie, strzelectwo"+ postac.opis();
        }


}
