package d14_09_2023;

import java.util.ArrayList;

public class Listic {

    ArrayList<Kombinacija> kombinacije;

    public Listic() {
        this.kombinacije= new ArrayList<>();
    }

    public void dodajKombinaciju(Kombinacija kombinacija){
        this.kombinacije.add(kombinacija);
    }
    public boolean daLiJeDobitnaKombinacija(Kombinacija dobitnaKombinacija){
        for (int i = 0; i < kombinacije.size(); i++){
            Kombinacija kombinacija= kombinacije.get(i);
            if (kombinacija.proveraKombinacija(dobitnaKombinacija)){
                return true;
            }
        }
        return false;
    }

    public void stampaj(){
        for (int i = 0; i < kombinacije.size(); i++){
            kombinacije.get(i).stampaj();
        }
    }
}
