package p19_09_2023;

public class Zgrada extends Objekat {

    private int brojStanova;

    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez() {
        return koeficijent() * povrsinaObjekta * brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Povrsina objekta "+adresa);
        System.out.println("Povrsina objekta "+povrsinaObjekta);
        System.out.println("Broj stanova " + brojStanova);
        System.out.println("Zona " + zona);
        System.out.println("Porez je " + porez());
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
}
