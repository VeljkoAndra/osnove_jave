package p18_09_2023;

public class StudentOsnovnih extends Student {


    public StudentOsnovnih(String imeiPrezime, int brojIndeksa, int godinaStudija) {
        super(imeiPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean daLiJeNaBudzetu() {
        if (this.getGodinaStudija()<5){
            return true;
        } else {return false;}
    }
}
