package d15_08_2023;

public class Vezbanje5 {
    public static void main(String[] args) {

        //Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl. Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja. Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
        //Primer izvrsenja
        //File: profile-image.log
        //Size: 25Mb
        //Download speed: 3Mb/s
        //Estimated time: 8s


String naziv = "background-image.png";
int size = 56;
int speed = 5;
int time = size / speed;


        System.out.println("File: " + naziv);
        System.out.println("Size: " + size + "Mb");
        System.out.println("Download speed: " + speed + "Mb/s");
        System.out.println("Estimated time: " + time + "s");




    }
}
