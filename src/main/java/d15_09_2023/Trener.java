package d15_09_2023;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    private ArrayList treneri;
    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
        System.out.println();
    }

    public ArrayList getTreneri() {
        return treneri;
    }


}
