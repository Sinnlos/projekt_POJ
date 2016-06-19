package przebudzenie;

public class Wojownik extends Dekorator {
    
    Postac postac;
    

public Wojownik(Postac postac){
    
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
        return postac.getProfesja() + "Wojownik";
    }
    else
    return postac.getProfesja() + ", wojownik";
}      

public String getUmiejetnosc() {
    if (postac.getUmiejetnosc() == "") {
        return postac.getUmiejetnosc() + "Walka wręcz, walka mieczem, walka toporem, walka włócznią";
    }
    else
    return postac.getUmiejetnosc() + ", walka wręcz, walka mieczem, walka toporem, walka włócznią.";
}

}
