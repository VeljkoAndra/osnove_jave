package p12_09_2023;

public class ClanskaKartica {
    private int popust;
    private String brojKartice;

    public ClanskaKartica(int popust, String brojKartice) {
        this.popust=popust;
        this.brojKartice=brojKartice;
    }



    public void setPopust(int popust){
        this.popust=popust;
    }
    public int getPopust(){
        return this.popust;
    }
    public void setBrojKartice(String brojKartice){
        this.brojKartice=brojKartice;
    }
    public String getBrojKartice(){
        return this.brojKartice;
    }
}
