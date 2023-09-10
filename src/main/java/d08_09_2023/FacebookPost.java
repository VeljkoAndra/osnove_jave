package d08_09_2023;

public class FacebookPost {
    public String koJePostavioPost;
    public String naCijemProfilu;
    public String tekst;
    public int brojLajkova;
    public int brojDeljenja;


    public void like(){
        brojLajkova++;
    }
    public void dislike(){
        brojLajkova--;
        if (brojLajkova <0){
            brojLajkova=0;
        }
    }
    public void share(){
        brojDeljenja++;
    }

    public void stampaj(){
        System.out.println(koJePostavioPost + ">>>>" + naCijemProfilu);
        System.out.println(tekst);
        System.out.println("Likes ("+brojLajkova+") | Shares ("+ brojDeljenja+")" );
    }


}
