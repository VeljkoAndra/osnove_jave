package d18_09_2023;

public class AudioControl extends Control{
    private boolean pojacajIliSmanji;



    public AudioControl(boolean pojacajIliSmanji) {
        this.pojacajIliSmanji = pojacajIliSmanji;
    }
    public void namestiZvuk(String izvrsiAkciju){
     if (izvrsiAkciju.equals("pojacaj")){
        this.pojacajIliSmanji=true;
     } else if (izvrsiAkciju.equals("smanji")){
         this.pojacajIliSmanji=false;
     }
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
       if (pojacajIliSmanji){
           videoPlayer.jacina= videoPlayer.jacina + 1;
           if (videoPlayer.jacina>100){
               videoPlayer.jacina=100;
           }
       } else {
           videoPlayer.jacina=videoPlayer.jacina-1;
           if (videoPlayer.jacina <0){
               videoPlayer.jacina=0;
           }
       }
    }



    public boolean isPojacajIliSmanji() {
        return pojacajIliSmanji;
    }

    public void setPojacajIliSmanji(boolean pojacajIliSmanji) {
        this.pojacajIliSmanji = pojacajIliSmanji;
    }




}
