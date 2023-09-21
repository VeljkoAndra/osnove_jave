package p12_09_2023;

public class ZoomCall {
    private String link;
    private String password;

    private Korisnik korisnikHost;
    private Korisnik korisnikGuest;


    public ZoomCall(String link, String password,Korisnik korisnikHost, Korisnik korisnikGuest){
        this.korisnikHost=korisnikHost;
        this.korisnikGuest=korisnikGuest;
        this.link=link;
        this.password=password;
    }
    public void printovanje(){
        System.out.println("Zoom Call: "+ this.getLink());
        System.out.println("Password: "+ this.password);
        System.out.println("Host: "+ korisnikHost.getFullName());
        System.out.println("Guset: "+ korisnikGuest.getFullName());
        System.out.println("Maksimalno trajanje poziva: "+ korisnikHost.duzinaPoziva() + "min");
    }
    public String getLink(){
       return this.link;
    }
    public String getPassword(){
        return this.password;
    }
    public Korisnik getKorisnikHost(){
        return this.korisnikHost;
    }
    public Korisnik getKorisnikGuest(){
        return this.korisnikGuest;
    }





}
