package p15_09_2023;

public class Profesor extends Osoba{
    protected String nazivPredmeta;
    protected double plata;

    public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta, double plata) {
        super(imeIPrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.plata = plata;
    }

    public Profesor() {
    }
    public void povecajPlatu(int procenatUvecanja){
        this.plata= plata* (100 + procenatUvecanja)/100;
    }
    @Override
    public void stampaj(){

        super.stampaj();
        System.out.println("PREDAJE: "+ nazivPredmeta);
        System.out.println("PLATA: "+ plata);
        System.out.println();
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
}
