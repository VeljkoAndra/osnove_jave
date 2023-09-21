package d15_09_2023;

import java.util.ArrayList;

public class Igrac2 extends  Osoba2{
    private int brojDresa;
    private String pozicija;
    ArrayList <Karton> kartoni;
    private boolean kapiten;

    public Igrac2() {
    }

    public Igrac2(String imeIPrezime, String jmbg, int godinaRodjenja, int brojDresa, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni=new ArrayList<>();
    }

    public void dodajKarton(Karton karton){
        kartoni.add(karton);
    }
    private int izbrojZute(){
        int zuti=0;
        for (int i =0; i < kartoni.size(); i++){
            if (kartoni.get(i).getKarton().equals("zuti")){
                zuti= zuti+1;
            }
        }
        return zuti;
    }
    private int izbrojCrvene(){
        int crveni=0;
        for (int i =0; i < kartoni.size(); i++){
            if (kartoni.get(i).getKarton().equals("crveni")){
                crveni= crveni+1;
            }
        }
        return crveni;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj dresa:" + brojDresa);
        System.out.println("Pozicija: " + pozicija);
        if (kapiten == true){
            System.out.println("Ovaj igrac je kapiten.");
        } else {
            System.out.println("Ovaj igrac nije kapiten.");
        }
        System.out.println("Broj zutih kartona "+ izbrojZute() + " | " + "Broj crvenih kartona "+ izbrojCrvene());
    }

}
