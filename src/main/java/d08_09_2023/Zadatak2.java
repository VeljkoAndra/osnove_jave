package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        //Kreirati klasu FacebookPost koja ima:
        //   Od atributa:
        //-	ime i prezime korisnika koji je objavio post
        //-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
        //-	tekst objave
        //-	broj lajkova
        //-	broj deljenja
        //  Od metoda:
        //-	like(), koja povecava broj lajkova za 1.
        //-	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
        //-	share(), koja povecava broj deljenja za 1
        //-	print(), koja stampa objavu u formatu:
        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
        //(tekst objave)
        //Likes (broj lajkova) | Shares (broj deljenja)
        //
        //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

        FacebookPost prviPost = new FacebookPost();
        prviPost.koJePostavioPost = "Marko Antonije";
        prviPost.naCijemProfilu= "Zeka Petrovic";
        prviPost.brojLajkova = 158;
        prviPost.brojDeljenja = 89;
        prviPost.tekst="Kako vam rodila paprika ove godine? Kako su tvoji? Pozdravi sve. Mi evo na more.";


        FacebookPost drugiPost = new FacebookPost();
        drugiPost.koJePostavioPost = "Milica Todosijevic";
        drugiPost.naCijemProfilu= "Teodora Brkic";
        drugiPost.brojLajkova = 690;
        drugiPost.brojDeljenja = 203;
        drugiPost.tekst="Dusooooooo, nokti su ti PRELEPIIIII!!!!!!!";

        prviPost.like(); prviPost.like(); prviPost.like();prviPost.like();
        prviPost.dislike();
        prviPost.share();
        prviPost.stampaj();
        System.out.println();
        System.out.println();

        drugiPost.like(); drugiPost.like(); drugiPost.like(); drugiPost.like(); drugiPost.like(); drugiPost.like(); drugiPost.like();
        drugiPost.dislike();
        drugiPost.share(); drugiPost.share();
        drugiPost.stampaj();


    }
}
