package d15_08_2023;

import java.math.RoundingMode;

public class Vezbanje8 {
    public static void main(String[] args) {
        //Napisati program koji simulira ponasanje auto video quality funkcionalnost na youtube-u.
        //Program od informacija ima:
        //naziv videa
        //duzinu fajla u sekundama (npr: ako video traje 2:29, cuva se 149s)
        //broj frame-ova  po sekundi
        //rezoluciju (duzina x visina frame-a)
        //Teorija: Frame je jedna slika u videu date rezolucije. video se sastoji od niza frame-ova i obicno se po sekundi prikaze od 20 do 30 frame-a, zavisno od samog videa. Npr: ako imate video koji traje 5s rezolucije 1920x1080 sa 10 frame-a po sekundi, to znaci da se u jednoj sekundi prikazu 10frama sto ce biti na po 100 milisekundi jedna slika.
        //Program racuna minimalan internet protok po sekundi potreban za datu rezoluciju. Minimalan internet protok je protok koji moze da ucita sekundu videa u sekundi. Minimalni protok treba da bude izrazen u Mb/s
        //Dodatno program isposuje informacije u odredjenom formatu. Napomena: Informacija za duzinu videa treba da bude u formatu minuti:sekunde
        //Primer izvrsenja:
        //*************************************************************************
        //Tea Tairović - Bibi Habibi (Official Video | Album Balerina)
        //2:29   <| | | | |
        //Number of frames per second: 20
        //Resolution: 1920x1080
        //Minimal network speed: 39Mb/s (edited)


        String name= "Cunami - Ne Pitaj";
        int duration = 173;
        int min = duration / 60;
        int sec= duration - min * 60;
        int framePerSec= 25;
        int length= 1080, height = 720;

        int kb = 1024;
        int Mb = 1024;

        double kl =(( 1.0 * length * height)/kb)/Mb;
        double frameNet= kl * framePerSec;
        frameNet = (int) frameNet;


        System.out.println(name);
        System.out.println(min + ":" + sec + "<||||");
        System.out.println("Numbers of frames per second: " + framePerSec);
        System.out.println("Resolution: " + length + "x" + height);
        System.out.println("Minimal network speed: " + frameNet + "Mb/s");



    }
}
