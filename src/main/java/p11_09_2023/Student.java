package p11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brIndeksa;
    private boolean budzet;

    // konstruktor/i, nema povratni tip
public Student(){

}
public Student (String ime, String prezime){
    this.ime= ime;
    this.prezime = prezime;
}
    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public int getBrIndeksa(){
        return brIndeksa;
    }
    public void setBrIndeksa(int brIndeksa){
        this.brIndeksa=brIndeksa;
    }
    public boolean getBudzet(){
        return budzet;
    }
    public void setBudzet(boolean budzet){
        this.budzet=budzet;
    }

    public  void stampaj(){
        String daLiJeNaBudzetu= "";
        if (budzet){
            daLiJeNaBudzetu=daLiJeNaBudzetu+ "Na budzetu.";
        } else {
            daLiJeNaBudzetu=daLiJeNaBudzetu+ "Samofinansirajuci.";
        }
        System.out.println("Ime i prezime studenta: " +this.ime +" "+ this.prezime +"; Indeks: "+ this.brIndeksa + "; Budzet: " + daLiJeNaBudzetu);

    }






}
