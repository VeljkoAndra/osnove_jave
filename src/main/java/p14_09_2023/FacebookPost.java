package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
 private String tekstObjave;
 private String fullNameKoJeObjavio;
 private Reakcija korsnik;
 ArrayList<Reakcija> tipReakcije;


    public FacebookPost(String tekstObjave, String fullNameKoJeObjavio) {
        this.tekstObjave = tekstObjave;
        this.fullNameKoJeObjavio = fullNameKoJeObjavio;
        this.tipReakcije=new ArrayList<>();
    }

    private int oredjenaRaakcija(String reakcija) {
        int counter = 0;

        for (int i = 0; i < tipReakcije.size(); i++) {
            if (tipReakcije.get(i).getTipRakcije().equals(reakcija)) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public void stampajSve() {
        System.out.println(this.fullNameKoJeObjavio);
        System.out.println(this.tekstObjave);
        System.out.println("Srce " + this.oredjenaRaakcija("srce") + " | Like " + this.oredjenaRaakcija("like") + " | Smajli " + this.oredjenaRaakcija("smajli"));
    }

    public void dodajReakciju(Reakcija reakcija) {
        this.tipReakcije.add(reakcija);
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public Reakcija getKorsnik() {
        return korsnik;
    }

    public void setKorsnik(Reakcija korsnik) {
        this.korsnik = korsnik;
    }
}
