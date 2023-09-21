package d19_09_2023;

import java.util.ArrayList;

public class PlaninskiDom {
    private String nazivDoma;
    private int godinaOsnovanja;
    ArrayList<Planinar> planinari;

    public PlaninskiDom() {
    }

    public PlaninskiDom(String nazivDoma, int godinaOsnovanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnovanja = godinaOsnovanja;
        this.planinari=new ArrayList<>();
    }

    public void uclaniPlaninara(Planinar planinar){
        this.planinari.add(planinar);
    }
    public void ukupnaClanarina(){
        double ukupno = 0;

        for (int i = 0; i < planinari.size(); i++){
            ukupno = ukupno + planinari.get(i).clanarina();
        }
        System.out.println("Ukupna clanarina za sve clanove iznosi: " + ukupno);
    }
    public int koCeSePopeti(Planina planina){
        int brojPlaninara=0;
        for (int i = 0; i < planinari.size(); i++){
            if (planinari.get(i).uspesanUspon(planina) == true){
                brojPlaninara=brojPlaninara+1;
            }
        }
        return brojPlaninara;
    }
    public void izbaciPlaninara(int indBroj){
        for (int i = 0; i < planinari.size(); i++){
            if (indBroj == planinari.get(i).celIndBroj){
                planinari.remove(i);
            }
        }
    }
    public void stampa(){
        for (int i = 0; i < planinari.size(); i++){
            planinari.get(i).stampaj();
            System.out.println(nazivDoma+" - Godina kada je osnovan: " + godinaOsnovanja);
            System.out.println();
        }
    }

}
