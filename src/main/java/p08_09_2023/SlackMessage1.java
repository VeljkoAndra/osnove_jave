package p08_09_2023;

public class SlackMessage1 {
    public String tekst;
    public String prezIime;

    public String datumiVreme;


    public void stampaj(){
        System.out.println(this.prezIime + " " + this.datumiVreme);
        System.out.println(this.tekst);

    }

    public void  azurirano(String drugItekst, String datum){
        this.tekst=drugItekst;
        this.datumiVreme = datum;

    }
}
