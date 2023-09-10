package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        //2.  Zadatak
        //Kreirati klasu Auto koja ima:
        //ime i prezime vozaca
        //marku automobila
        //broj vrata
        //potrosnju na 100km (npr: 3.6 litra)
        //trenutnu brzinu kojom se auto krece
        //metodu za stampu koja stampa podatke u formatu:
        //[Vozac]
        //	[Marka] - [br vrata]-ro vrata
        //	Sa potrosnjom od [potrosnja] l na 100km
        //	[Trenutna brzina auta] km/h je trenutna brzina.
        //
        //Primer:
        //	Milan Jovanovic
        //	BMW - 5-ro vrata
        //	Sa potrosnjom od 10 l na 100km
        //	200 km/h je trenutna brzina

        Auto auto = new Auto();
        auto.vozac = "Veljko Andrijasevic";
        auto.marka = "BMW";
        auto.brojVrata = 4;
        auto.potrosnja = 6.5;
        auto.trenutnaBrzina = 120;
        auto.godinaProizvodnje = 1999;
        auto.vazenjeRegistracije = 6;
        auto.kubikaza=1800;
        auto.daLiJeKlimaUkljucena = true;
        auto.brojRegistracije= "4935791423";
        auto.maksimalnaBrzina = 300;

auto.dodajGas();
auto.dodajGas();
        auto.stampanje();

        if (auto.prekoracenje(80)==true){
            System.out.println("Auto je prekoracio brzinu ");
            System.out.println("Kazna za prekoracenje je "+ auto.kazna(80)+"rsd.");
        } else {
            System.out.println("Auto nije prekoracio brizinu.");
        }

        if (auto.oldtimer(auto.godinaProizvodnje)){
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }

         if (auto.registracija(8)){
             System.out.println("Registracija je istekla.");
         } else {
             System.out.println("Auto je registrovan.");
         }
        System.out.println("Cena registracije je " +auto.cenaRegistracije() + "rsd.");

        System.out.println("Treenutna potrosnja je: "+ auto.treutnaPotrosnja()+ ".");

        auto.stampajTablu();

    }
}
