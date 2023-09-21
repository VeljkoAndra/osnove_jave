package p19_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadatak 2. Kreirati apstraktnu klasu Atleticar čiji su tributi:
        //ime i prezime privatni
        //i rezultat ostvaren na takmičenju koji je zasticen
        //Javne metode klase su:
        //apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
        //metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
        //Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
        //Kreirati i klasu Disciplina čiji su privatni atributi:
        //ime discipline
        //tip discipline (Trkacka ili Skakacka)
        //niz atletičara koji učestvuju u toj disciplini.
        //U javnom delu klase definisati:
        //konstuktore, gettere i settere
        //konstruktor koji postavlja ime discipline i tip
        //metodu dodaj atleticara u disciplinu
        //metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
        //(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
        //(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
        //U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
        //(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.
        Disciplina disciplina1= new Disciplina("Skok u dalj", "Skakacka");
        Disciplina disciplina2= new Disciplina("110m sa preponama", "Trkacka");

        Trkac trkac1 = new Trkac("Marko", "Marko", 123);
        Trkac trkac2 = new Trkac("Mirko", "Mirko", 156);
        Trkac trkac3 = new Trkac("Filip", "Filip", 119);

        Skakac skakac1= new Skakac("Marko", "Marko", 123);
        Skakac skakac2= new Skakac("Mirko", "Mirko", 156);
        Skakac skakac3= new Skakac("Filip", "Filip", 119);

        disciplina2.ateleticars.add(trkac1);
        disciplina2.ateleticars.add(trkac2);
        disciplina2.ateleticars.add(trkac3);

        disciplina1.ateleticars.add(skakac1);
        disciplina1.ateleticars.add(skakac2);
        disciplina1.ateleticars.add(skakac3);

        trkac1.poredenje(trkac2);
        trkac1.stampaj();
        System.out.println("Najbolji trkac je "+disciplina2.najbljiRezultat());
        System.out.println("Najbolji skakac je "+disciplina1.najbljiRezultat());
    }
}
