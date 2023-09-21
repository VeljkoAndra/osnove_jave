package d19_09_2023;

public class SuperKartica {
    private String brojKartice;
    private String imeVlasnika;
    private int popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String imeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imeVlasnika = imeVlasnika;
        this.popust = popust;
    }
    public void stampajKarticu(){
        System.out.println(brojKartice + "" + imeVlasnika);
    }
    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
}
