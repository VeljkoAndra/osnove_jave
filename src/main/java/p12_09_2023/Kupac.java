package p12_09_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKartica clanskaKartica;
    public Kupac(String imeIPrezime){
        this.imeIPrezime=imeIPrezime;
    }

    public void stampaj(){
        System.out.println(imeIPrezime +" "+ clanskaKartica.getBrojKartice());

    }
    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime=imeIPrezime;
    }
    public String getImeIPrezime(){
        return this.imeIPrezime;
    }

    public int getPopust(){
        return clanskaKartica.getPopust();
    }
    public String getBrojKartice(){
       return clanskaKartica.getBrojKartice();
    }

    public void setClanskaKartica(ClanskaKartica clanskaKartica){
        this.clanskaKartica=clanskaKartica;
    }

}
