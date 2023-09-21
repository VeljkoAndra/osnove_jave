package p18_09_2023;

public class StudentMaster extends Student {
    public StudentMaster(String imeiPrezime, int brojIndeksa, int godinaStudija) {
        super(imeiPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean daLiJeNaBudzetu() {
        if (this.getGodinaStudija()<2){
            return true;
        } else {return false;}
    }
}
