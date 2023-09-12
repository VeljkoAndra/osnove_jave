package d11_09_2023;

public class Korisnik {
    private String ime;
    private String prezime;


    public Korisnik(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }
    public void spamapanje(){
        System.out.println(this.ime + " " + this.prezime);
    }

    public void setIme (String ime){
        this.ime=ime;
    }
    public String getIme(){
        return this.ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public String getPrezime(){
        return this.prezime;
    }

}
