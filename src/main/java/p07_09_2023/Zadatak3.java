package p07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        //Krairti klasu SlackMessage koja ima:
        //tekst poruke
        //ime i prezime osobe koja je stavila poruku
        //datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
        //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
        //[ime i prezime osobe] - [kad je poslata]
        //[Tekst poruke]

    SlackMessage prva = new SlackMessage();
        prva.tekst = "Ovo je prvi tekst.";
        prva.prezIime="Marko Markovic";
        prva.datumiVreme="29.10.2045  17:56";
        SlackMessage druga = new SlackMessage();

        druga.tekst = "Ovo je drugi tekst.";
        druga.prezIime="Marko Markovic";
        druga.datumiVreme="09.08.2078  17:47";

        System.out.println(prva.prezIime + " " + prva.datumiVreme);
        System.out.println(prva.tekst);
        System.out.println();
        System.out.println(druga.prezIime + " " + druga.datumiVreme);
        System.out.println(druga.tekst);
    }
}
