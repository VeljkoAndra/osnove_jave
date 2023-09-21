package p19_09_2023;

public class Kuca extends Objekat{
    private int brojClanova;


    public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez() {
        return koeficijent() * povrsinaObjekta;
    }

    @Override
    public void stampaj() {
        System.out.println("Povrsina objekta "+adresa);
        System.out.println("Povrsina objekta "+povrsinaObjekta);
        System.out.println("Ukupno clanova " + brojClanova);
        System.out.println("Zona " + zona);
        System.out.println("Porez je " + porez());

    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
}
