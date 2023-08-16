package d15_08_2023;

public class Vezbanje6 {
    public static void main(String[] args) {

        //Napisati program koji izracunava velicinu slike na temelju dostupnih podataka. Program cuva sledece informacije o slici:
        //•	Naziv slike
        //•	Rezoluciju (duzina i visina)
        //Na osnovu rezolucije, program racuna ukupan broj piksela u slici. Svaki piksel zauzima 1b (bajt).
        //Teorijski primer: ako je rezolucija slike 20x10, tada slika sadrzi ukupno 200 piksela, čime je njena velicina 200b.
        //Nakon toga, program treba da prikaze velicinu slike izrazenu u kilobajtima (kb) i megabajtima (mb), uzimajuci u obzir sedece konverzije:
        //•	1 kb = 1024b
        //•	1 Mb= 1024 kb
        //Primer izvrsenja
        //File: profile-image.log
        //Resolution: 1920 x 1080
        //Size (kb): 2 025
        //Size (Mb):  1.977

String name = "background-image.png";
int length= 1080;
int height = 720;
int sizebites = length * height;
int sizekb = sizebites / 1024;
double sizeMb= 1.0 * sizekb / 1024;

        System.out.println("File name: " + name);
        System.out.println("Resolution: " + length + " x " + height);
        System.out.println("Size in kb: " + sizekb);
        System.out.println("Size in Mb: " + sizeMb);




    }
}
