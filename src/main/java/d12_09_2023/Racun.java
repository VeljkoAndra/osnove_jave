package d12_09_2023;

public class Racun {
    private String brojRacuna;
    private String imeiPrezime;
    private double trenutnoStanjeNaRacunu;

public Racun (String brojRacuna, String imeiPrezime, double trenutnoStanjeNaRacunu){
    this.imeiPrezime=imeiPrezime;
    this.trenutnoStanjeNaRacunu=trenutnoStanjeNaRacunu;
    this.brojRacuna=brojRacuna;
}
    public void stampajPodtake(){
        System.out.println(this.imeiPrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je "+trenutnoStanjeNaRacunu+"rsd.");
    }
    public void ulatiNaRacun(double iznosUplate){
    this.trenutnoStanjeNaRacunu+=iznosUplate;
    }
    public void skiniSaRacuna (double iznosSkidanja){
    this.trenutnoStanjeNaRacunu= this.trenutnoStanjeNaRacunu - iznosSkidanja;
    }
    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeiPrezime(String imeiPrezime) {
        this.imeiPrezime = imeiPrezime;
    }

    public String getBrojRacuna() {
        return this.brojRacuna;
    }

    public String getImeiPrezime() {
        return this.imeiPrezime;
    }

    public double getTrenutnoStanjeNaRacunu() {
return this.trenutnoStanjeNaRacunu;
    }
}
