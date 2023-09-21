package p12_09_2023;

public class Korisnik {
    private String fullName;
    private String licenca;

    public Korisnik (String fullName){
        this.fullName= fullName;
        this.licenca = "basic";
    }
    public void stampaj(){
        System.out.println(fullName);
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getLicenca(){
        return this.licenca;
    }
    public void pretplata(int pretplata){
        if (pretplata ==100){
            licenca="pro";
        } else if (pretplata==150) {
            licenca="premium";
        }
    }
    public void ponistiPretplatu(){
        licenca.equals("basic");
    }
    public int duzinaPoziva(){
        if (licenca.equals("basic")){
            return 40;
        } else if (licenca.equals("pro")) {
            return 240;
        } else if (licenca.equals("premium")) {
            return 1440;
        } return 0;
    }
}
