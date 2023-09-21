package p15_09_2023;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;

    public Osoba() {
    }

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }
public void stampaj (){
    System.out.println("IME: "+ imeIPrezime);
    System.out.println("JMBG: " + this.jmbg);
}
    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
