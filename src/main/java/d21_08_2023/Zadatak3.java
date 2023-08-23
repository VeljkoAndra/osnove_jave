package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        3.	Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//●	ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//●	ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite tekst: Cao!
//                Cao!
//                Unesite tekst: Hello
//                Hello!
//                Unesite tekst: Hi!
//                Hi!
//                Unesite tekst: Cuti
//                Cuti!
//                Unesite tekst: Ajde!
//                Ajde!
//                Nivo agresivnosti 60.
//        (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int N = s.nextInt();
        int brojac = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite teskt: ");
            String text = s.next();

            if (text.contains("!")) {
                brojac++;
                System.out.println( text);
            } else {
                System.out.println(text+ "!");
            }

        }

        int procenat = 100/N*brojac;
        System.out.println("Nivo agresivnosti: "+ procenat+ "%.");






    }
}
