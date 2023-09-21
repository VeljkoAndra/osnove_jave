package d19_09_2023;

public abstract class Planinar {
    protected int celIndBroj;
    protected String imeiPrezime;

    public Planinar(int celIndBroj, String imeiPrezime) {
        this.celIndBroj = celIndBroj;
        this.imeiPrezime = imeiPrezime;
    }
    public abstract void stampaj();
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina planina);


    public int getCelIndBroj() {
        return celIndBroj;
    }
    public String getImeiPrezime() {
        return imeiPrezime;
    }

    private void setCelIndBroj(int celIndBroj) {
        this.celIndBroj = celIndBroj;
    }

    private void setImeiPrezime(String imeiPrezime) {
        this.imeiPrezime = imeiPrezime;
    }
}
