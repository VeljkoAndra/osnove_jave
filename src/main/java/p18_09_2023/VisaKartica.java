package p18_09_2023;

public class VisaKartica extends PlatnaKartica{


    public String ovlascenoLice;


    public VisaKartica(double suma, String brojKartice, int doKadVazi, int mesecDoKadaVazi, String ovlascenoLice) {
        super(suma, brojKartice, doKadVazi, mesecDoKadaVazi);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double vrednost) {
        double porez= vrednost - (vrednost *(100-1.8)/100) ;
        if (porez <4){
            porez=4;
        }
        this.suma=suma-(vrednost+porez);
    }


    @Override
    public void stampaj() {
        System.out.println("Visa Card: " + this.brojKartice + ", "  + this.mesecDoKadaVazi+ "/"+this.doKadVazi + ", $" + suma);
    }
    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
}
