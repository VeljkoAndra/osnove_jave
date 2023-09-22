package d14_09_2023;

import java.util.ArrayList;

public class History {
    ArrayList<HistoryPage>stranice;

    public History() {
        this.stranice=new ArrayList<>();
    }
    public void dodajStranicu(HistoryPage historyPage){
        this.stranice.add(historyPage);
    }
    public void izbrisiPremaLinku(String link){
        for (int i = 0; i < stranice.size(); i++){
            if (this.stranice.get(i).getLinkStranice().equals(link)){
                this.stranice.remove(i);
            }
        }
    }
    public void obrisiKolaciceZaLink(String homePage){
        for (int i = 0; i < stranice.size(); i++){
            if (stranice.get(i).getNazivStranice().equals(homePage)){
                this.stranice.get(i).obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju(){
        for (int i = 0; i < stranice.size(); i++){
            this.stranice.remove(i);
        }
    }
    public void sacuvajKred(String nazivStranice, String email, String password){
        for (int i = 0; i < stranice.size(); i++){
            if (stranice.get(i).getNazivStranice().equals(nazivStranice)){
                stranice.get(i).sacuvajKredencijale(email,password);
            }
        }
    }
    public void pogledajIstoriju(){
        for (int i = 0; i < stranice.size(); i++){
            stranice.get(i).stampaj();
        }
    }
    public void obrisiSveKredi(){
        for (int i = 0; i < stranice.size(); i++){
            stranice.get(i).obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaZadnjihSatVremena(int trenutniSat, int trenutniMinit) {
        for (int i = 0; i < stranice.size(); i++){
            int razlikaSat=trenutniSat-stranice.get(i).getVremeOtvaranjaSat();
            int razlikaMinut=trenutniMinit - stranice.get(i).getGetVremeOtvaranjaMinut();
        if (razlikaSat==0){
            stranice.get(i).obrisiKolacice();
        } else if (razlikaSat==1 && razlikaMinut ==0){
            stranice.get(i).obrisiKolacice();
        } else if (razlikaSat==1 && stranice.get(i).getGetVremeOtvaranjaMinut()>trenutniMinit) {
            stranice.get(i).obrisiKolacice();
        }
        }
    }



}
