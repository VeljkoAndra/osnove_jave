package p19_09_2023;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;
    ArrayList<Ateleticar> ateleticars;


    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        this.ateleticars = new ArrayList<>();
    }
    public void dodajAtleticara(Ateleticar ateleticar){
            ateleticars.add(ateleticar);
      }
      public void diskvalifikujAtelticara(String ime, String prezime){
        for (int i = 0; i < ateleticars.size(); i++) {
            if (ateleticars.get(i).getIme().equals(ime) && ateleticars.get(i).getPrezime().equals(prezime)){
                ateleticars.remove(i);
            }
        }
    }

    public Ateleticar najbljiRezultat() {
        Ateleticar najbolji = this.ateleticars.get(0);
        for (int i = 1; i < this.ateleticars.size(); i++) {
			if (this.ateleticars.get(i).poredenje(najbolji)) {
				najbolji = this.ateleticars.get(i);
			}
		}

		return najbolji;

        }
    public String getImeDiscipline() {
        return imeDiscipline;
    }
    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }
    public String getTipDiscipline() {
        return tipDiscipline;
    }
    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }
}
