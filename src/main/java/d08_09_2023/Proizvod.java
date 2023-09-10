package d08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;


    public void stampaj(){
        System.out.println(naziv + ", "+ cena+"rsd, "+ tezina+ "g.");
    }
    public void povecajCenu(double povecanje){
        cena = cena + povecanje;
    }
    public double vratiCenuSaPopustom(double popust){
        double cenaSaPopustom = cena *(popust/100);
        double novaCena= cena-  cenaSaPopustom;
        return novaCena;
    }
public int postarina(){
        int cena = 0;
        if (tezina<=100){
            cena = 200;
        }else if (tezina>100 && tezina <=500){
            cena = 400;
        } else if (tezina >500){
            cena = 1000;
        }
        return cena;
}




}
