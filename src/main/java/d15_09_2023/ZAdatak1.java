package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class ZAdatak1 {
    public static void main(String[] args) {
        //1.Zadatak
        //Kreirati klasu Osoba koja ima:
        //-	ime i prezime
        //-	jmbg
        //-	godinu rodjenja
        //-	default-ni konstuktor
        //-	konstuktor sa parametrima
        //-	gettere i settere
        //-	metodu stampaj koja stampa u formatu:
        //(ime i prezime), (jmbg), (godina rodjenja)
        //
        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //-	broj (broj koji igrac nosi)
        //-	poziciju koju igra (odbrambeni, napadac, … )
        //-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //-	default-ni konstuktor
        //-	konstuktor sa parametrima
        //-	gettere i settere za broj, kapiten i poziciju
        //-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //
        //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
        //-	godine iskustva
        //-	tip trenera (kondicioni, za igru, pomocni, personalni)
        //-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
        //
        //U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
        Scanner s=new Scanner(System.in);
        ArrayList<Igrac> igraci = new ArrayList<Igrac>();
        ArrayList<Trener> treneri = new ArrayList<Trener>();


        Igrac igrac1= new Igrac("Marko Markovic", "9731235112", 1997, 35, "Golman", false);
        Igrac igrac2= new Igrac("Nikola Nikolic", "8523511235", 1995, 3, "Napadac", true);

        Trener trener1= new Trener("Zivota Stanisic", "74123512311", 1974, 35, "Personalni");
        Trener trener2= new Trener("Mirko Raketa", "14912475123", 1985, 10, "Pomocni");

        igrac1.stampaj();
        igrac2.stampaj();
        trener1.stampaj();
        trener2.stampaj();


        System.out.print("Koliko igraca zelite da dodate: ");
        int broj= s.nextInt();

        for (int i = 0; i < broj; i++){
            System.out.print("Unesite ime i prezime: ");
            String fullName = s.next();
            System.out.print("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja: ");
            int rodjenje= s.nextInt();
            System.out.print("Unesite broj dresa: ");
            int brojDresa = s.nextInt();
            System.out.print("Unesite poziciju");
            String pozicija = s.next();
            System.out.print("Da li je ovaj igrac kapiten?");
            boolean kapiten = s.nextBoolean();
            Igrac igrac = new Igrac(fullName, jmbg, rodjenje, brojDresa, pozicija, kapiten);
            igraci.add(i,igrac);
        }

        System.out.print("Koliko trenera zelite da dodate: ");
        int brojDodavanja= s.nextInt();
        for (int i =0; i < brojDodavanja; i++){
            System.out.print("Unesite ime: ");
            String fullName = s.next();
            System.out.print("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja: ");
            int godinjaRodjenja = s.nextInt();
            System.out.print("Unesite godine iskustva: ");
            int godineIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tip = s.next();
            Trener trener = new Trener(fullName, jmbg, godinjaRodjenja, godineIskustva, tip);
            treneri.add(i, trener);
        }


        System.out.println();
            for (int i = 0; i < igraci.size(); i++){
                igraci.get(i).stampaj();
            }
        System.out.println();
        for (int i = 0; i < treneri.size(); i++){
            treneri.get(i).stampaj();
        }



    }
}
