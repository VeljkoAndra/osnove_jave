package p14_09_2023;

public class Film {
    private String ime ;

    private int godina;



    public Film() {
    }

    public Film(String ime, int godina) {
        this.ime = ime;
        this.godina = godina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getGodina() {
        return godina;


    }
}
