package przebudzenie;

public class Zabojca extends Dekorator {
    Postac postac;
    
public Zabojca(Postac postac){
    
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
        return postac.getProfesja() + "Zabójca";
    }
    else
    return postac.getProfesja() + ", zabójca";
}      

public String getUmiejetnosc() {
    if (postac.getUmiejetnosc() == "") {
        return postac.getUmiejetnosc() + "Skradanie, trucizny, walka wręcz";
    }
    else
    return postac.getUmiejetnosc() + ", skradanie, trucizny, walka wręcz.";
}

}
