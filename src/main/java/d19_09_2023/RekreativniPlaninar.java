package d19_09_2023;

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpereme;
    private String okrug;
    private int maxUsponBezOpreme;

    public RekreativniPlaninar(int celIndBroj, String imeiPrezime, int tezinaOpereme, String okrug, int maxUsponBezOpreme) {
        super(celIndBroj, imeiPrezime);
        this.tezinaOpereme = tezinaOpereme;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }


    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + celIndBroj);
        System.out.println("Ime i prezime: " + imeiPrezime);
        System.out.println("Okrug: " + okrug);
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        int maksUsponSaOpremon = maxUsponBezOpreme - (tezinaOpereme*50);
    if (planina.getVisinaPlanine()<=maksUsponSaOpremon){
        return true;
    } else {
        return false;
    }
    }

}
