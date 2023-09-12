package d11_09_2023;

public class FacebookPost {
    private String opisPosta;

    private Korisnik korisnik;

    public FacebookPost(){}

    public void stampanjePosta(){
        korisnik.spamapanje();
        System.out.println(opisPosta);
    }
    public void setOpisPosta(String opisPosta){
        this.opisPosta=opisPosta;
    }
    public String getOpisPosta(){
        return opisPosta;
    }
    public Korisnik getKorisnik(){
        return this.korisnik;
    }
    public void setKorisnik(Korisnik korisnik){
        this.korisnik=korisnik;
    }
}
