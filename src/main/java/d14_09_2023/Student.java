package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String fullStudentName;
    private String tipStudija;
    ArrayList <Ispit> ispiti;


    public Student(int brIndeksa, String fullStudentName, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.fullStudentName = fullStudentName;
        this.tipStudija = tipStudija;
        this.ispiti=new ArrayList<>();
    }
    public void dodajIspit(Ispit ispiti){
        this.ispiti.add(ispiti);
    }
    public double prosekIspita(){
        double prosek=0;
        double brojPolozenih=0;
        for (Ispit ispit : ispiti) {
            if (ispit.getOcena() > 5) {
                brojPolozenih = brojPolozenih + 1;
                prosek = prosek + ispit.getOcena();
            }
        }
        return prosek/brojPolozenih;
    }

    public void stampaj(){
        System.out.println(brIndeksa + " - "+ fullStudentName+ " - " +tipStudija);
        System.out.println("Predmeti: ");
        for (Ispit ispit : ispiti) {
            ispit.stampa();
        }
        System.out.println("Prosecna ocena je: " + prosekIspita());
    }
    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getFullStudentName() {
        return fullStudentName;
    }

    public void setFullStudentName(String fullStudentName) {
        this.fullStudentName = fullStudentName;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
}
