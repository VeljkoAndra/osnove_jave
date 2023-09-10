package p08_09_2023;

import p07_09_2023.SlackMessage;

public class Zadatak1 {
    public static void main(String[] args) {
        //Krairti klasu SlackMessage koja ima:
        //tekst poruke
        //ime i prezime osobe koja je stavila poruku
        //datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
        //(dopuna) kreirati metodu za stampu koja stampa podatke u formatu
        //[ime i prezime osobe] - [kad je poslata]
        //[Tekst poruke]
        //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke

        SlackMessage1 prva = new SlackMessage1();
        prva.tekst = "Ovo je prvi tekst.";
        prva.prezIime="Marko Markovic";
        prva.datumiVreme="29.10.2045  17:56";

        SlackMessage1 druga = new SlackMessage1();
        druga.tekst = "Ovo je drugi tekst.";
        druga.prezIime="Marko Markovic";
        druga.datumiVreme="09.08.2078  17:47";

        prva.stampaj();
        prva.azurirano("Ovo je azurirano za prvi tekst.","30.10.2045");
        prva.stampaj();
        System.out.println();
        druga.stampaj();
        druga.azurirano("Ovo je azurirano za drugi tekst.","10.09.202078");
        druga.stampaj();






    }

}
