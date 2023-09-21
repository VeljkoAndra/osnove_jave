package p19_09_2023;

public abstract class Objekat {
    protected String adresa;
    protected double povrsinaObjekta;
    protected int zona;

    public Objekat(String adresa, double povrsinaObjekta, int zona) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public double koeficijent() {
        if (zona == 1){
            return 1.4;
        } else if(zona ==2){
            return 1.1;
        } else{
            return 1.05;
        }
    }


    public abstract double porez();
    public abstract void stampaj();

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
}
