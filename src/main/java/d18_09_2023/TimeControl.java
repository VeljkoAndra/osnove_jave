package d18_09_2023;

public class TimeControl extends  Control{
    private boolean vreme;

    public TimeControl(boolean vreme) {
        this.vreme = vreme;
    }

    public void namestiVreme(String namestiVreme){
        if (namestiVreme.equals("unapred")){
           vreme=true;
        } else if (namestiVreme.equals("unazad")){
            vreme=false;
        }
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
      if (vreme){
         videoPlayer.trenutnoVremeVidea= videoPlayer.trenutnoVremeVidea + 15;
         if (videoPlayer.trenutnoVremeVidea>videoPlayer.duzinaVidea){
             videoPlayer.trenutnoVremeVidea=videoPlayer.duzinaVidea;
         }
      } else {
            videoPlayer.trenutnoVremeVidea= videoPlayer.trenutnoVremeVidea - 15;
            if (videoPlayer.trenutnoVremeVidea<0){
                videoPlayer.trenutnoVremeVidea=0;
            }
      }
    }

    public boolean isVreme() {
        return vreme;
    }

    public void setVreme(boolean vreme) {
        this.vreme = vreme;
    }
}


