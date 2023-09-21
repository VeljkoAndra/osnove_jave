package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik korisnik1 = new Korisnik("Srdjan Srdjanovic");
        korisnik1.pretplata(100);
        Korisnik korisnik2 = new Korisnik("Marko Petrovic");

        ZoomCall prviCall = new ZoomCall("wjqpwdase2312", "25612385",korisnik1,korisnik2);

        prviCall.printovanje();


    }
}
