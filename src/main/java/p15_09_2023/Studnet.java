package p15_09_2023;

public class Studnet extends Osoba{
    private int brIndeksa;
    private double dugSkolarine;

    public Studnet(String imeIPrezime, String jmbg, int brIndeksa, double dugSkolarine) {
        this.setImeIPrezime(imeIPrezime);
        this.setJmbg(jmbg);
        this.brIndeksa = brIndeksa;
        this.dugSkolarine = dugSkolarine;
    }

    public Studnet() {
    }
    public void smanjiSkolarnu(double uplata){
        this.dugSkolarine= dugSkolarine-uplata;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("INDEKS: "+ this.brIndeksa);
        System.out.println("SKOLARINA: " + this.dugSkolarine);
        System.out.println();
    }

}
