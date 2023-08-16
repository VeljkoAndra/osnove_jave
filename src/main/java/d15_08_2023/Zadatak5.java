package d15_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {
        //5. Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
        //Primer izvrsenja programa:
        //a: 10
        //Povrsina je 43.25
        //Obim je 30

        int a = 5;
        int o = 3 * a;
        double p = (a * a * 1.73) / 4;

        System.out.println("Obim: " + o);
        System.out.println("Povrsina: " + p);
    }
}
