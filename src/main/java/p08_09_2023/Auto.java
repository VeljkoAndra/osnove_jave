package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrzina;
    public int vazenjeRegistracije;
    public int godinaProizvodnje;
    public int kubikaza;
    public String brojRegistracije;
    public boolean daLiJeKlimaUkljucena;
    public int maksimalnaBrzina;

    public void stampanje(){
        System.out.println(vozac);
        System.out.println(marka + " - " + brojVrata+"-ro vrata");
        System.out.println("Sa potrosnjom od " + potrosnja+ " na 100km");
        System.out.println(trenutnaBrzina +"km/h je trenutna brzina");
    }

    public boolean prekoracenje(int x){
    if (trenutnaBrzina >x){
       return true;
    }    else {
        return false;
    }
    }
    public int  kazna (int x){
        if (this.prekoracenje(x)){
            return  (trenutnaBrzina - x) * 1000;
        } else {
            return  0;
        }

    }
    public boolean oldtimer(int godina){
        if (godina < 1950){
           return true;
        }
        return false;
    }
    public boolean registracija(int trenutniMesec) {
        if (this.vazenjeRegistracije > trenutniMesec) {
            return true;
        } else {
            return false;
        }
    }
public double cenaRegistracije(){
      if (kubikaza<2000){
          return kubikaza*100;
      }  else {double  x = (kubikaza *100);
      return x = x + (x * 0.3);
      }
}
    public void dodajGas(){
        this.trenutnaBrzina = trenutnaBrzina +10;
        if (trenutnaBrzina>240){
            trenutnaBrzina =maksimalnaBrzina;}
    }
    public void koci(){
        this.trenutnaBrzina = trenutnaBrzina -10;
        if (trenutnaBrzina<0){trenutnaBrzina = 0;}
    }
    public double treutnaPotrosnja() {
        if (daLiJeKlimaUkljucena == true) {
            double potrosnjaSaKlimom = (trenutnaBrzina / 100.0 * this.potrosnja) * 1.2;
            return potrosnjaSaKlimom;
        } else {
            double potrosnjaBezKlime = (trenutnaBrzina / 100.0 * this.potrosnja) * 1.0;
            return potrosnjaBezKlime;
        }
    }
public void stampajTablu(){
        String tabala= "";
        for (int i = 0; i< 100; i++){
            if (i <=((trenutnaBrzina*100)/maksimalnaBrzina)){
                tabala = tabala+ "|";
            }else {
                tabala = tabala + ".";
            }
            }
    System.out.println(tabala+ trenutnaBrzina+ "/" + maksimalnaBrzina + "km/h");
}






}
