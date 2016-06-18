package przebudzenie;

public class Zabojca extends Profesja {
    Postac postac;
    
public Zabojca(Postac postac){
    
    this.postac = postac;
}

    public String getDescription(){
        
        return postac.getDescription() + ", Zabójca ";
        
        }

    
    public String opis(){
        return " skradanie, trucizny, walka wręcz" + postac.opis();
        }


}
