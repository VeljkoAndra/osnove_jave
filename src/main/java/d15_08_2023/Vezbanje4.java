package d15_08_2023;

public class Vezbanje4 {
    public static void main(String[] args) {
        //Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla.Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb.Na kraju programa racuna i ispisuje koji je deo fajla skinut.
        // Stampanje se vrsi u format
        // naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
        //*****************************
        //***********procenat %
        //*****************************
        //Primer izvrsenja:
        //profile-image.png 7Mb/2Mb
        //*****************************
        //*********** 28%
        //*****************************

        String nazivFajla = "background-image.png";
        double oVelicina = 10;
        double sVelicina = 4;
        double procenat = (sVelicina/oVelicina) *100;



        System.out.println(nazivFajla + " " + oVelicina + "Mb/" + sVelicina + "Mb");
        System.out.println("********************************");
        System.out.println("************ " + procenat + "%");
        System.out.println("********************************");






    }
}
