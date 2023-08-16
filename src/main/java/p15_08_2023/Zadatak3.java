package p15_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji na ekranu stampa podatke u formatu:
        //[IME I PREZIME]
        //[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
        //[EMAIL]

        String firstAndLastName = "Veljko Andrijasevic";
        String phoneNumber = "06712345678";
        String ulicaIBroj = "Palih boraca 31";
        String grad = "Kursumlija";
        String email = "andrijasevicveljko1999@gmail.com";

        System.out.println("Ime i prezime: " + firstAndLastName);
        System.out.print("Broj telefona: " + phoneNumber + ", ");
        System.out.print("Ulica i broj" + ulicaIBroj + ", ");
        System.out.println("Grad: " + grad);
        System.out.println("Email: " + email);

    }
}
