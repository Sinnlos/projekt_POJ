package przebudzenie;

public class Lowca extends Dekorator{
    Postac postac;
    
    public Lowca(Postac postac){
        
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
            return postac.getProfesja() + "Łowca";
        }
        else
        return postac.getProfesja() + ", łowca";
    }      

    public String getUmiejetnosc() {
        if (postac.getUmiejetnosc() == "") {
            return postac.getUmiejetnosc() + "Skradanie, strzelectwo";
        }
        else
        return postac.getUmiejetnosc() + ", skradnie, strzelectwo.";
    }

    }


