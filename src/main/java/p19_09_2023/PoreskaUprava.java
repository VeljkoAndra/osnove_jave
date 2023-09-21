package p19_09_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    ArrayList<Objekat> objekti;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        objekti= new ArrayList<>();
    }

    public void dodajObjekat(Objekat objekat){
        objekti.add(objekat);
    }
    public void porezGrada(){
        double porez = 0;
        for (int i = 0; i < objekti.size(); i++){
           porez= porez +  objekti.get(i).porez();
        }
        System.out.println("Porez za ceo grad je: " + porez);
    }

    public void stampaj(){
        for (int i = 0; i < objekti.size(); i++){
            objekti.get(i).stampaj();
            System.out.println();
        }
    }

    public void najveciPorez(){
        double maksPorez= 0;
        for (int i = 0; i < objekti.size(); i++) {
               if (maksPorez < objekti.get(i).porez()){
                   maksPorez= objekti.get(i).porez();
               }
        }
        System.out.println("Najveci porez je: " + maksPorez);
    }

    public void najmanjiPorez() {
        double minPorez = 0;
        for (int i = 0; i < objekti.size(); i++) {
            minPorez = objekti.get(i).porez();
            if (minPorez > objekti.get(i).porez()){
                minPorez= objekti.get(i).porez();
            }
        }
        System.out.println("Najmanji porez je: " + minPorez);
    }
}
