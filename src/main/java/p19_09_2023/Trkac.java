package p19_09_2023;

public class Trkac extends Ateleticar{
    public Trkac(String ime, String prezime, double rezultat) {
        super(ime, prezime, rezultat);
    }
    @Override
    public boolean poredenje(Ateleticar ateleticar) {
        if (this.rezultat<ateleticar.rezultat){
            return true;
        } else {return false;}
    }

}
