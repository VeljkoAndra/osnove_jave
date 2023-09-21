package p18_09_2023;

public class JednakTrougao extends Figura{

    private double a;
    public JednakTrougao(double a){
        this.a=a;
    }
    @Override
    public double povrsina() {
        return (a * a) *1.73 /4;
    }
    @Override
    public double obim() {
        return 3*a;
    }
}
