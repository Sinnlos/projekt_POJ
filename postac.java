package przebudzenie;

public abstract class Postac {
    
    String rasa = "";
    String profesja = "";
    String zdolnosc = "";
    String umiejetnosc = "";
    
    public String getRasa(){
        
        return rasa;
    }
    
    public String getProfesja() {
        
        if (profesja != null) {
            
            return "";
            
        }
        
        else {
            
            return profesja;
            
        }
        
    }
    
    public String getZdolnosc() {

        return zdolnosc;
        
    }
    
    public String getUmiejetnosc() {
        

        return umiejetnosc;
        
    }
}
