package p15_09_2023;

public class VisaKartica extends PlatnaKartica{
    private String ovlascenoLice;

    public VisaKartica(double suma, String brojKartice, int godinaDoKadVazi, int mesecDoKadVazi, String ovlascenoLice) {
        super(suma, brojKartice, godinaDoKadVazi, mesecDoKadVazi);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double vrednost) {
        if (vrednost * 1.8 < 4){
            vrednost= vrednost+4;
        }else {
            vrednost = vrednost + (vrednost * 1.8 /100);
        }
        super.izvrsiTransakciju(vrednost);
    }
    @Override
    public void stampaj(){
        System.out.println("Visa Card: "+brojKartice + ", " + mesecDoKadVazi+"/"+godinaDoKadVazi + ", $" + suma);
        System.out.println();
    }
    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
}
