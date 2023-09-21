package d18_09_2023;

public class VideoPlayer {
    protected int duzinaVidea;
    protected int trenutnoVremeVidea;
    protected int jacina;
    protected int kvalitet;

    public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacina, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacina = jacina;
        this.kvalitet = kvalitet;
    }
    public void stampaj(){
        System.out.println("Ukupno trajanje videa " + duzinaVidea);
        System.out.println("Trenutno vreme videa " + trenutnoVremeVidea);
        System.out.println("Jacina " + jacina);
        System.out.println("Kvalitet videa " + kvalitet);
        System.out.println();
    }
    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacina() {
        return jacina;
    }

    public void setJacina(int jacina) {
        this.jacina = jacina;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }
}
