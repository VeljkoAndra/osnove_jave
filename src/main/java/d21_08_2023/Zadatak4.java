package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //1.	Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
        //Program podrzava sledece reakcije:
        //●	like
        //●	smile
        //●	heart
        //
        //	Primer izvrsenja:
        //Unesite N: 7
        //	Reaguj: like
        //	Reaguj: heart
        //	Reaguj: smile
        //	Reaguj: lol
        //	Reaguj: smile
        //	Reaguj: like
        //	Reaguj: like
        //Summary: like 3 | smile 2 | heart 1
        //
        //Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
        //
        //POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int N = s.nextInt();

        int counterHeart = 0;
        int counterSmile = 0;
        int counterLike = 0;

   for (int i =0; i< N; i++) {
       System.out.print("Reaguj: ");
       String r = s.next();

       if (r.equals("like")) {counterLike++;
   } else if (r.equals("smile")) {counterSmile++;} else if (r.equals("heart")) {
           counterHeart++;
       }}
       System.out.println("Summary: "+ "like "+ counterLike+ " | "+"smile "+counterSmile+" | "+ "heart "+counterHeart);

   }
}
