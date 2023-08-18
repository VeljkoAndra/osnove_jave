package d15_08_2023;

public class Vezbanje9 {
    public static void main(String[] args) {
        //1.
        //Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se baterija na telefonu napuni do 100%. Program od informacija cuva:
        //•	Naziv telefona
        //•	Kapacitet baterije u mAh (miliamper sat)
        //•	Trenutna napunjenost baterije u % (procentima)
        //•	Struja punjenja u mA (miliamper)
        //Teorijski: Struja punjenja nam kaze koliko se miliampera napuni za 1h punjenja.
        //Primer izvrsenja:
        //Iphone 11 pro max
        //Kapacitet baterije: 3000mAh
        //Baterija trenutno na 20%
        //Struja punjenja 1000mA
        //Procenjeno vreme punjenja je 2.4h.

        String naziv = "Asus ROG Phone 6";

        double a= 6000;
        //Kapacitet baterije u mAh

        double b = 20;
        //Trenutna napunjenost baterije u %

        double c= 1000;
        //Struja punjenja u mA

        double d =a * (b / 100);
        double f = (a - d) / c;
        //Procenjeno vreme punjenja

        System.out.println(naziv);
        System.out.println("Kapacitet baterije: " + a + "mAh");
        System.out.println("Baterija trenutno na: " + b + "%");
        System.out.println("Struja punjenja: " + c + "mA");
        System.out.println("Procenjeno vreme punjenja je: " + f + "h");
    }

}
