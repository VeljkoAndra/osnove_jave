package p19_09_2023;

public class Lokal extends Objekat {

    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double porez() {
        return koeficijent()*povrsinaObjekta*1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Povrsina objekta "+adresa);
        System.out.println("Povrsina objekta "+povrsinaObjekta);
        System.out.println("Zona " + zona);
        System.out.println("Porez je " + porez());
    }
}
