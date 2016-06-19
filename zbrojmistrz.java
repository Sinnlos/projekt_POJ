package przebudzenie;

public class Zbrojmistrz extends Dekorator{
    Postac postac;
    
public Zbrojmistrz(Postac postac){
    
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
        return postac.getProfesja() + "Zbrojmistrz";
    }
    else
    return postac.getProfesja() + ", zbrojmistrz";
}      

public String getUmiejetnosc() {
    if (postac.getUmiejetnosc() == "") {
        return postac.getUmiejetnosc() + "Naprawa ekwipunku";
    }
    else
    return postac.getUmiejetnosc() + ", naprawa ekwipunku.";
}

}
    


