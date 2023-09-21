package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        JednakTrougao trougao = new JednakTrougao(5);
        JednakTrougao trougao1= new JednakTrougao(6);

        Pravougaonik pravougaonik = new Pravougaonik(3 , 4);
        Pravougaonik pravougaonik1 = new Pravougaonik(5 , 8);
        Pravougaonik pravougaonik2 = new Pravougaonik(1 , 3);

        Figura a;
        a = trougao;
        a= trougao1;
        a=pravougaonik;
        a=pravougaonik1;
        a=pravougaonik2;

        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(trougao);
        figure.add(trougao1);
        figure.add(pravougaonik);
        figure.add(pravougaonik1);
        figure.add(pravougaonik2);

        for (int i = 0; i < figure.size(); i++){
            figure.get(i).stampaj();
        }

        double povrsine = 0;
        double obimi = 0;
        for (int i = 0; i < figure.size(); i++){
            obimi= obimi + povrsine + figure.get(i).obim();
            povrsine = povrsine + figure.get(i).povrsina();
        }
        System.out.println("Ukupna povrsina je " + povrsine);
        System.out.println("Ukupni obim je " + obimi);
    }
}
