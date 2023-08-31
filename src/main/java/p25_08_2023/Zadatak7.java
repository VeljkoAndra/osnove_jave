package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
        // Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
        //Trougao je pravougli ukoliko je a*a+b*b=c*c
int a = 5;
int b = 6;
int c = 11;
        System.out.println(number(a, b, c ));

    }
    public static boolean number(int broj1, int broj2, int broj3){
        if (broj1 * 2+broj2 *2 ==broj3* 2) {
          return true;
        } else {return false;}
    }
}
