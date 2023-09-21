package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze= new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza ambalaza){
        ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < ambalaze.size(); i++){
            if (ambalaze.get(i).barkod.equals(barkod)){
                ambalaze.remove(i);
            }
        }
    }
    public double cenaSaPopustom(SuperKartica superKartica){
        double cenaPopust = 0;
        for (int i = 0; i < ambalaze.size(); i++){
           cenaPopust= cenaPopust + this.ambalaze.get(i).cena();
        } return cenaPopust  - superKartica.getPopust();
    }

}
