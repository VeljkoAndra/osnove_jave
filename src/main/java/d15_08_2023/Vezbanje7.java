package d15_08_2023;

public class Vezbanje7 {
    public static void main(String[] args) {

// . Napisati program za promenu velicine slike na osnovu cuvanih podataka. Program cuva sledece informacije:
//•	Naziv slike
//•	Rezoluciju (duzina i visina)
//•	Faktor skaliranja
//Na osnovu faktora skaliranja, program će odluciti hoce li sliku smanjiti ili povecati.
//Evo teorijskih primera za faktor skaliranja:
//•	ako je originalna slika 1920x1080, a faktor skaliranja 0.8, slika ce se smanjiti za 20% i rezolucija ce postati 1536x864.
//•	S druge strane, ako je faktor skaliranja 1.3, slika ce se povecati za 30% i rezolucija ce postati 2496x1404.
//Na kraju programa, prikazati velicinu svake slike u megabajtima (MB). Naziv nove slike se dobija dodavanjem prefiksa "resized-" originalnom nazivu.
//Primer izvrsenja:
//Original image: profile-image.png  Size: 1.977Mb
//Scale: 1.3
//Resized image: resized-profile-image.png Size: 3.342Mb
//| Click here to Download image |

        String name = "background-image.png";
        int length= 1080, height = 720;
        double scaling = 1.3;

        double org = ((1.0 * length * height) /1024) /1024;
        double scale = (((scaling * length) * (scaling * height)) /1024)/1024;

        System.out.println("Original image: " + name + "  Size: " + org);
        System.out.println("Scale: " + scaling);
        System.out.println("Resized image: resized-" + name + "  Size: " + scale);
        System.out.println("| Click here to download image|");


    }
}
