package d12_09_2023;

public class Ugovor {
    private String godinaDanMesecUgovora;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cenaNekretnine;
    private String adresaNekretnine;

    public Ugovor(FizickoLice prodavac, FizickoLice kupac){
        this.prodavac=prodavac;
        this.kupac=kupac;
    }
    public void stampaUgovora(){
        System.out.print("Dana(" + godinaDanMesecUgovora+ ")god skolpljen je ugovor izmedju (" );
        prodavac.stampaFizickogLica();
        System.out.print(") i (" );
        kupac.stampaFizickogLica();
        System.out.print(") o kupovini nekretnine "+ adresaNekretnine + " po ceni od " + cenaNekretnine + "eur, pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + zadradaAgencije() + "rsd.");
    }
    public double procenatZarade(){
        if (kupac.getDaliJeKupovaoPrekoAgencije()==true){
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double zadradaAgencije(){
       return 1000 + cenaNekretnine * procenatZarade();
    }

    public void setGodinaDanMesecUgovora(String godinaDanMesecUgovora){
        this.godinaDanMesecUgovora=godinaDanMesecUgovora;
    }
    public void setCenaNekretnine(double cenaNekretnine){
        this.cenaNekretnine= cenaNekretnine;
    }
    public void setAdresaNekretnine (String adresaNekretnine){
        this.adresaNekretnine=adresaNekretnine;
    }
    public String getGodinaDanMesecUgovora(){
        return this.godinaDanMesecUgovora;
    }
    public double getCenaNekretnine(){
        return this.cenaNekretnine;
    }
    public String getAdresaNekretnine(){
        return this.adresaNekretnine;
    }
    public FizickoLice getProdavac(){
        return this.prodavac;
    }
    public FizickoLice getKupac(){
        return this.kupac;
    }
}
