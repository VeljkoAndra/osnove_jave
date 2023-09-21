package p14_09_2023;

import java.util.ArrayList;

    public class Pasta {
    private ArrayList <Sastojak> sastojci;

        public Pasta() {
           this.sastojci= new ArrayList<>();
        }

        public void dodajSastojak(Sastojak noviSastojak){
        this.sastojci.add(noviSastojak);
    }
    public double cenaPaste(){
            double ukupnaCena= 0;
        for (Sastojak sastojak : this.sastojci) {
            ukupnaCena = ukupnaCena + sastojak.getCena();
        }
       return ukupnaCena;
    }
    public void stapmanje(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i=0; i < this.sastojci.size(); i++){
            this.sastojci.get(i).Stampaj();
        }
        System.out.println("Ukupna cena paste je: " + cenaPaste());
    }

        public void brisanje(String satojakZaBrisanje) {
            for (int i = 0; i < sastojci.size(); i++) {
                if (sastojci.get(i).getNaziv().equals(satojakZaBrisanje)) {
                    sastojci.remove(i);
                }
            }
        }
}
