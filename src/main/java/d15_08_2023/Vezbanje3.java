package d15_08_2023;

public class Vezbanje3 {
    public static void main(String[] args) {
        //(Za vezbanje)
        //Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
        //Svaka komponenta boje je u opsegu od 0 do 255(informativno)
        //Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
        //Primer izvrsenja:
        //Originalna boja: RGB(140, 12,  100)
        //Kontrastna boja: RGB(115, 243, 155)Ako vas zanima koja je originalna a koja kontrast boja, mozete ih ukucati na https://g.co/kgs/jTAfZe

int r = 235;
int g = 45;
int b = 68;

int r1 = 250 - r;
int g1 = 250 - g;
int b1 = 250 - b;

        System.out.println("Kontrastna boja je: " + "RGB(" +r1 +", " + g1 + ", " + b1 + ")");


    }
}
