package d17_08_2023;

import java.util.Scanner;

public class Vezbanje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Tea Tairovic je zatrazila od svojih najvernijih fanova ako mogu da joj izadju u susret i razviju softver za njene potrebe. Najveci fan Veljko se javio i iz razgovora je izvukao sta je potrebno da softver radi.
//Posto je izbacila 3 najveca hita, potrebno joj je da sracuna zaradu od pregleda na youtubu.
//Tea zaradjuje $1 na 1000 pregleda.
//Dok ne dodje do 50k pregleda, sve sto se zaradi sa youtube-a ostaje njoj.
// Ukoliko ima od 50k do 100k pregleda njen mendzer joj uzima fiksno $50, a sve preko 100k pregleda dele po pola.
//Program sa tastature ucitava ukupan broj pregleda jednog videa i ispisuje koliko ce Tea zaraditi od njega.***Sva imena likova u ovom zadatku su izmišljena. Svaka sličnost sa stvarnim osobama je slucajna i nenamerna.
        System.out.println("Unesi broj pregleda Tea <3: ");
int a = s.nextInt();

if (a <= 50000) {a = (a/1000) * 1; {
    System.out.println("Tea ljubavi tvoja zarada na ovoj pesmi je: "+ a);
}}
if (a > 50000 && a <= 100000) {a =((a/1000)*1)-50;{
    System.out.println("Tea ljubavi tvoja zarada na ovoj pesmi je: "+ a);
} }
if (a > 100000) {a = ((a - 100000)/1000)/2 + (((100000/1000)*1)-50);{;
    System.out.println("Tea ljubavi tvoja zarada na ovoj pesmi je: "+ a);}}







    }
}
