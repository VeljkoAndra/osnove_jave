package d08_09_2023;

public class SmartAirConditioning {
    public String markaKlime;
    public int potrosnjaElEngHladjenje;
    public int getPotrosnjaElEngGrejanje;
    public int temperatura;
    public String mod;

    public void stampanje() {
        if (temperatura<16){
            temperatura = 16;
        } else if (temperatura >35) {
            temperatura = 35;
        }
        System.out.println(markaKlime + " - " + mod + " -  " + temperatura);
    }

    public int mesecnjaPotrosnjakWh() {

        if (mod.equals("hladi")) {
            int kwh = 30 * 15 * potrosnjaElEngHladjenje;
            return kwh;
        } else {
            int kwh = 30 * 15 * getPotrosnjaElEngGrejanje;
             return kwh ;
        }
    }

    public void mesecnaNovcanaPotrosnja(int mesecnokwh) {
        if (mesecnokwh <= 350) {
            mesecnokwh = mesecnokwh * 6;
            System.out.println("Vasa potrosnja u dinarima za ovaj mesec iznosi: " + mesecnokwh + "rsd.");
        }else {
            mesecnokwh= mesecnokwh * 9;
            System.out.println("Vasa potrosnja u dinarima za ovaj mesec iznosi: " + mesecnokwh + "rsd.");
        }

    }







}