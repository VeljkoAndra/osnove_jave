package p11_09_2023;

public class Reziser {
    private String imeRezisera;
    private int kolikoImaGodina;


    public Reziser(){}
    public Reziser(String imeRezisera, int kolikoImaGodina){
        this.imeRezisera=imeRezisera;
        this.kolikoImaGodina=kolikoImaGodina;
    }
    public void stampajRezisera(){
        System.out.println(imeRezisera + ", " + kolikoImaGodina + ".");
    }
    public void setImeReziser(String ime){
        this.imeRezisera=ime;
    }
    public String getImeResizera(){
        return imeRezisera;
    }
    public void setKolikoImaGodina(int godine){
        this.kolikoImaGodina=godine;
    }
    public int getKolikoImaGodina(){
        return kolikoImaGodina;
    }


}
