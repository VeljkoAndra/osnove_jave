package p11_09_2023;

public class Film {
    private String imeFilma;
    private int godinaIzlaska;

private Reziser koGaJeRezirao;
    public Film(){}
    public Film(String imeFilma, int godinaIzlaska, Reziser reziser){
        this.imeFilma=imeFilma;
        this.godinaIzlaska=godinaIzlaska;
        this.koGaJeRezirao = reziser;
    }
    public void stampajFilm(){
        System.out.println(imeFilma + ", "+godinaIzlaska + ".");
        if (koGaJeRezirao != null){
            koGaJeRezirao.stampajRezisera();
        }
    }
    public String getImeFilma(){
    return imeFilma;
    }
    public void setImeFilma(String ime){
        this.imeFilma=ime;
    }
    public int getGodinuIzlaska(){
        return godinaIzlaska;
    }
    public void setGodinuIzlaska(int godina){
        this.godinaIzlaska=godina;
    }

public void setKoGaJeRezirao(Reziser koGaJeRezirao){
     this.koGaJeRezirao=koGaJeRezirao;
}
public Reziser getKoGaJeRezirao(){
      return this.koGaJeRezirao;
}

}
