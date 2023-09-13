package d12_09_2023;

public class Transakcija {
    private String idTransakcije;
    private Racun posiljalac;
    private Racun primalac;

    public Transakcija (String idTransakcije, Racun posiljalac, Racun primalac){
        this.idTransakcije=idTransakcije;
        this.posiljalac=posiljalac;
        this.primalac=primalac;
    }
    public void stampaTransakciju(){
        System.out.println(idTransakcije);
        System.out.println("Sa racuna: " + posiljalac.getImeiPrezime() + " - " + posiljalac.getBrojRacuna());
        System.out.println("Na racun: " + primalac.getImeiPrezime() + " - " + primalac.getBrojRacuna());
    }

    public void transakcija(double iznosPrenosa){
      primalac.ulatiNaRacun(iznosPrenosa);
      double skidanje =iznosPrenosa + (iznosPrenosa*(100-45)/100);
      posiljalac.skiniSaRacuna(skidanje);

    }
//    public double provizija(){
//        if (<=4500){
//        return 45;
//        } else if (>4500) {
//            return 1;
//        } else {return 0;}
//    }



    public Racun getPosiljalac(){
        return this.posiljalac;
    }
    public Racun getPrimalac(){
        return this.primalac;
    }
    public String getIdTransakcije(){
    return this.idTransakcije;
}
}
