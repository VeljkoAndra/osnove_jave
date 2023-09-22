package d14_09_2023;

public class HistoryPage {
    private String nazivStranice;
    private String linkStranice;
    private int vremeOtvaranjaSat;
    private int vremeOtvaranjaMinut;
    private String email;
    private String password;

    public HistoryPage(String nazivStranice, String linkStranice, int vremeOtvaranjaSat, int vremeOtvaranjaMinut) {
        this.nazivStranice = nazivStranice;
        this.linkStranice = linkStranice;
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
        this.vremeOtvaranjaMinut = vremeOtvaranjaMinut;

    }
    public void sacuvajKredencijale( String email, String password){
        this.password=password;
        this.email=email;
    }
    public void obrisiKolacice(){
        this.email=null;
        this.password=null;
    }
    public void stampaj(){
        System.out.println();
        System.out.print(this.vremeOtvaranjaSat + ":" + this.vremeOtvaranjaMinut);
        System.out.print(" - "+this.nazivStranice + " - " + linkStranice);
        if (this.password!=null && this.email!=null){
            System.out.print(" *");
        }

    }


    public String getNazivStranice() {
        return nazivStranice;
    }

    public String getLinkStranice() {
        return linkStranice;
    }

    public int getVremeOtvaranjaSat() {
        return vremeOtvaranjaSat;
    }

    public int getGetVremeOtvaranjaMinut() {
        return vremeOtvaranjaMinut;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public void setLinkStranice(String linkStranice) {
        this.linkStranice = linkStranice;
    }

    public void setVremeOtvaranjaSat(int vremeOtvaranjaSat) {
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
    }

    public void setGetVremeOtvaranjaMinut(int getVremeOtvaranjaMinut) {
        this.vremeOtvaranjaMinut = getVremeOtvaranjaMinut;
    }
}
