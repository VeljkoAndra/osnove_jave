package d12_09_2023;

public class FizickoLice {
    private String fullName;
    private String brojLicneKarte;
    private String jmbg;
    private boolean daLiJeKupovaoPrekoAgencije;

    public FizickoLice (String fullName, String brojLicneKarte, String jmbg, boolean daLiJeKupovaoPrekoAgencije){
        this.fullName=fullName;
        this.brojLicneKarte=brojLicneKarte;
        this.jmbg=jmbg;
        this.daLiJeKupovaoPrekoAgencije=daLiJeKupovaoPrekoAgencije;
    }

    public void stampaFizickogLica() {
        System.out.print(fullName + ", " + brojLicneKarte);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDaLiJeKupovaoPrekoAgencije(boolean daLiJeKupovaoPrekoAgencije) {
        this.daLiJeKupovaoPrekoAgencije = daLiJeKupovaoPrekoAgencije;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getBrojLicneKarte() {
        return this.brojLicneKarte;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public boolean getDaliJeKupovaoPrekoAgencije() {
        return this.daLiJeKupovaoPrekoAgencije;
    }
}
