package d12_09_2023;

public class ZeleniKarton {
    private String fullStudentName;
    private int brIndeksa;
    private String nazivPredmeta;
    private String fullProffesorName;
    private int ocena;

    public ZeleniKarton (String fullStudentName, int brIndeksa, String nazivPredmeta, String fullProffesorName, int ocena){
        this.fullProffesorName=fullProffesorName;
        this.fullStudentName=fullStudentName;
        this.brIndeksa=brIndeksa;
        this.nazivPredmeta=nazivPredmeta;
        this.ocena=ocena;
    }
    public void ispit(){
        if (this.ocena<=5){
            System.out.println("Nije polozio.");
        } else if (this.ocena>5 && this.ocena<=10){
            System.out.println("Polozio.");
        }
    }
    public void stampanje(){
        System.out.println(nazivPredmeta + " - "+ ocena);
        System.out.println("Student: " + this.fullStudentName + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.fullProffesorName);
    }
    public String getFullStudentName(){
        return this.fullStudentName;
    }
    public int getBrIndeksa(){
        return this.brIndeksa;
    }
    public String getNazivPredmeta(){
        return this.nazivPredmeta;
    }
    public String getFullProffesorName(){
        return this.fullProffesorName;
    }
    public int getOcena(){
        return this.ocena;
    }

}
