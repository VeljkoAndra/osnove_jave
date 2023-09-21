package p18_09_2023;

public abstract class Student {
    protected String imeiPrezime;
    protected int brojIndeksa;
    protected int godinaStudija;

    public Student(String imeiPrezime, int brojIndeksa, int godinaStudija) {
        this.imeiPrezime = imeiPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public abstract int cenaSkolarine();
    public abstract boolean daLiJeNaBudzetu();

    public void stampaj(){
        System.out.println(imeiPrezime + ", " + brojIndeksa+", "+ godinaStudija);
        if (daLiJeNaBudzetu()==true){
            System.out.println("Finansiranje: Budzet.");
        } else {
            System.out.println("Finansiranje: Samofinansirajuci.");
        }
        System.out.println("Cena " + cenaSkolarine());
        System.out.println();
    }
    public String getImeiPrezime() {
        return imeiPrezime;
    }

    public void setImeiPrezime(String imeiPrezime) {
        this.imeiPrezime = imeiPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
}
