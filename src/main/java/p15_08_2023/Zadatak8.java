package p15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
        //Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
        //Primer izvrsenja:
        //a: 5
        //Povrsina kvadrata je 25
        //r: 3
        //Povrsina kruga je 28.26

        int a = 5;
        double pKvadrata = a * a ;
        int r = 3;
        double pi = 3.14;
        double pKruga = r * r *pi;

        double sKvad= pKvadrata/a;
        double pKrugaPoluprecnika = (pKruga / r) / 3.14;

        System.out.println("Povrsina kvadrata stranice je: " + sKvad);
        System.out.println("Povrsina kruga poluprecnika je: " + pKrugaPoluprecnika);






    }
}
