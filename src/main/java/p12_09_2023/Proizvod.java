package p12_09_2023;

public class Proizvod {
    private String nazivProizvoda;
    private double cenaIzradeProizvoda;
    public Kupac kupac;

    public double cena(){
        return  cenaIzradeProizvoda * 1.9 *(100 - kupac.getPopust() )/100;

    }
    public void stampanje(){
        System.out.println(nazivProizvoda + " -- "+ cena());
        kupac.stampaj();
    }

    public void setNazivProizvoda(String nazivProizvoda){
        this.nazivProizvoda=nazivProizvoda;
    }
    public String getNazivProizvoda(){
        return this.nazivProizvoda;
    }
    public void setCenaIzradeProizvoda(int cenaIzradeProizvoda){
        this.cenaIzradeProizvoda=cenaIzradeProizvoda;
    }

    public double getCenaIzradeProizvoda() {
        return cenaIzradeProizvoda;
    }
    public void setKupac(Kupac kupac){
        this.kupac=kupac;
    }

}
