package d18_09_2023;

public class QualityOptimizerControl extends Control{
   private double brzinaNeta;

    public QualityOptimizerControl(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double brzina = brzinaNeta * 10.1;
        if (brzina <=144){
            videoPlayer.kvalitet = 144;
        } else if (brzina>144 &&  brzina<=240) {
            videoPlayer.kvalitet=240;
        } else if (brzina>240 && brzina <=720) {
            videoPlayer.kvalitet=720;
        } else if (brzina > 720) {
            videoPlayer.kvalitet=1080;
        }
    }


    public double getBrzinaNeta() {
        return brzinaNeta;
    }

    public void setBrzinaNeta(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }
}
