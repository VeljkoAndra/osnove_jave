package d11_09_2023;

public class Knjiga {
    private String isbn;
    private String nazivKnjige;
    private int godinaIzdanja;
    private Autor autorKnjige;

    public Knjiga (String isbn, String nazivKnjige, int godinaIzdanja){
    this.isbn=isbn;
    this.nazivKnjige= nazivKnjige;
    this.godinaIzdanja=godinaIzdanja;
    }
    public void stampa(){
        System.out.println(isbn);
        System.out.println(nazivKnjige + " - "+ godinaIzdanja);
        autorKnjige.stampanje();
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setNazivKnjige(String nazivKnjige){
        this.nazivKnjige=nazivKnjige;
    }
    public String getNazivKnjige(){
        return this.nazivKnjige;
    }
    public void setGodinaIzdanja(int godinaIzdanja){
        this.godinaIzdanja=godinaIzdanja;
    }
    public int getGodinaIzdanja(){
        return this.godinaIzdanja;
    }
    public void setAutorKnjige(Autor autorKnjige){
        this.autorKnjige=autorKnjige;
    }
    public Autor getAutorKnjige (){
        return this.autorKnjige;
    }
}
