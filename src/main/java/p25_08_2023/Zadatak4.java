package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
        int x= 2;
        int f= 4;

        rezultat(x,f);


    }

    public static void rezultat(int broj1, int broj2){
        int x = broj1 + broj2;
        System.out.println(x);

        int y = broj1-broj2;
        System.out.println(y);

        int p = broj1 / broj2;
        System.out.println(p);

        int m = broj1 * broj2;
        System.out.println(m);


    }


}
