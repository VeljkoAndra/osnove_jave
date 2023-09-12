package d11_09_2023;

public class Autor {
    private String imeAutora;
    private String prezimeAutora;

    public Autor (){}
    public Autor (String imeAutora, String prezimeAutora){
        this.imeAutora=imeAutora;
        this.prezimeAutora=prezimeAutora;
    }

    public void stampanje(){
       System.out.println("Autor: " + this.imeAutora + " " + this.prezimeAutora);
    }
    public void setImeAutora (String imeAutora){
         this.imeAutora=imeAutora;
    }
    public String getImeAutora(){
        return this.imeAutora;
    }
    public void setPrezimeAutora(String prezimeAutora){
        this.prezimeAutora=prezimeAutora;
}
    public String getPrezimeAutora(){
        return this.prezimeAutora;
    }









}
