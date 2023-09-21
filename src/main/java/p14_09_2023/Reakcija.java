package p14_09_2023;

public class Reakcija {
    private String tipRakcije;
    private String fullNameKorisnikaKojiReaguje;


    public Reakcija(String tipRakcije, String fullNameKorisnikaKojiReaguje) {
        this.tipRakcije = tipRakcije;
        this.fullNameKorisnikaKojiReaguje = fullNameKorisnikaKojiReaguje;
    }

    public String getTipRakcije() {
        return tipRakcije;
    }

    public void setTipRakcije(String tipRakcije) {
        this.tipRakcije = tipRakcije;
    }

    public String getFullNameKorisnikaKojiReaguje() {
        return fullNameKorisnikaKojiReaguje;
    }

    public void setFullNameKorisnikaKojiReaguje(String fullNameKorisnikaKojiReaguje) {
        this.fullNameKorisnikaKojiReaguje = fullNameKorisnikaKojiReaguje;
    }
}
