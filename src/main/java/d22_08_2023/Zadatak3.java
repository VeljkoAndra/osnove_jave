package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3.	Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        // Primer izvrsenja:
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 50
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.
        Scanner s= new Scanner(System.in);

        boolean end= false;

        while (!end){
            System.out.print("Unesite rimski broj: ");
            String broj = s.next();

            if (broj.equals("I")) {broj = "1";
                System.out.println("Arapski broj: "+ broj);
            }
            else if (broj.equals("V")) {broj = "5";
                System.out.println("Arapski broj: "+ broj);
            }
            else if (broj.equals("X")) {broj = "10";
                System.out.println("Arapski broj: "+ broj);
            }
            else if (broj.equals( "L")) {broj = "50";
                System.out.println("Arapski broj: "+ broj);
            }
            else if (broj.equals("C")) {broj = "100";
                System.out.println("Arapski broj: "+ broj);
            }
            else if (broj.equals("D")) {broj = "500";
                System.out.println("Arapski broj: "+ broj);
            }
            else if (broj.equals("M")) { broj = "1000";
                System.out.println("Arapski broj: "+ broj);
            }
else if (broj.equals("KRAJ")) {end=true;}

        }
        System.out.println("Kraj programa.");


    }
}
