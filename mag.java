package przebudzenie;

public class Mag extends Dekorator{
    Postac postac;
    
    public Mag(Postac postac){
    
    this.postac = postac;
    }
    
    public String getRasa() {
        
        return postac.getRasa();
        
    }
    
    public String getZdolnosc() {
        return postac.getZdolnosc();
    }
    
    public String getProfesja() {
        if (postac.getProfesja() == "") {
            return postac.getProfesja() + "Mag";
        }
        else
        return postac.getProfesja() + ", mag";
    }      
    
    public String getUmiejetnosc() {
        if (postac.getUmiejetnosc() == "") {
            return postac.getUmiejetnosc() + "Czarowanie, eliksiry";
        }
        else
        return postac.getUmiejetnosc() + ", czarowanie, eliksiry.";
    }

}

