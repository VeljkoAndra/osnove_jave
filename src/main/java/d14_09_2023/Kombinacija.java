package d14_09_2023;

import java.util.ArrayList;

public class Kombinacija {
    private String idKombinacije;

    ArrayList<Integer> brojevi;

    public Kombinacija(String idKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.idKombinacije = idKombinacije;
        this.brojevi =new ArrayList<>();
        this.brojevi.add(jedan);this.brojevi.add(dva);this.brojevi.add(tri);this.brojevi.add(cetiri);
        this.brojevi.add(pet);this.brojevi.add(sest);this.brojevi.add(sedam);
    }

    public String getIdKombinacije() {
        return idKombinacije;
    }
    public boolean proveraKombinacija(Kombinacija k){
        for (int i = 0; i < brojevi.size(); i ++){
            if (this.brojevi.get(i) != k.brojevi.get(i)){
                return false;
            }
        }
        return true;
    }
    public void stampaj(){
        System.out.print("ID: " + idKombinacije + " ");
        System.out.print("Brojevi: ");
        for (int i = 0; i < brojevi.size(); i++){
            System.out.print(brojevi.get(i));
            System.out.print(", ");
            if (i == brojevi.size() -1){
                System.out.print("");
                System.out.println();
            }
        }
    }

}
