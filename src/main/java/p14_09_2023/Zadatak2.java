package p14_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Reakcija reakcija1= new Reakcija("smajli", "Marko Majsotr");
        Reakcija reakcija2= new Reakcija("like", "Pera Kojot");
        Reakcija reakcija3= new Reakcija("smajli", "Mirko Kupusar");
        Reakcija reakcija4= new Reakcija("srce", "Mirka Ostojic");
        Reakcija reakcija5= new Reakcija("smajli", "Brzi Nikola");
        Reakcija reakcija6= new Reakcija("smajli", "MarkoMarijana Zajednicki");
        Reakcija reakcija7= new Reakcija("like", "Marina nokti");
        Reakcija reakcija8= new Reakcija("like", "Pera kostolomac");

        FacebookPost post1= new FacebookPost("Idu dva vuka ulicom, jedan zavija drugi odvija xaxaxaxaxaxaxax XDDDD", "Voz za EX-YU");

        post1.dodajReakciju(reakcija1);
        post1.dodajReakciju(reakcija2);
        post1.dodajReakciju(reakcija3);
        post1.dodajReakciju(reakcija4);
        post1.dodajReakciju(reakcija5);
        post1.dodajReakciju(reakcija6);
        post1.dodajReakciju(reakcija7);
        post1.dodajReakciju(reakcija8);

        post1.stampajSve();


    }
}
