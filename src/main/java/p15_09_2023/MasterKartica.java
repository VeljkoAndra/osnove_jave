package p15_09_2023;

public class MasterKartica extends  PlatnaKartica{

    public MasterKartica(double suma, String brojKartice, int godinaDoKadVazi, int mesecDoKadVazi) {
        super(suma, brojKartice, godinaDoKadVazi, mesecDoKadVazi);
    }

    @Override
    public void izvrsiTransakciju(double vrednost) {
       vrednost=vrednost + (vrednost * 1.8 /100);
        super.izvrsiTransakciju(vrednost);
    }
    public void naplatiOdrzavanje() {
        this.suma -= 2;
    }

    @Override
    public void stampaj(){
        System.out.println("Master Card: "+brojKartice + ", " + mesecDoKadVazi+"/"+godinaDoKadVazi + ", $" + suma);
        System.out.println();
    }
}
