package p18_09_2023;

public class FigureGenerator{
    public Figura figureGenerator(String tipFigure){
        Figura generisanaFigura = null;
        if (tipFigure.equals("trougao")){
            return new JednakTrougao(5);
        } else if (tipFigure.equals("pravougaonik")){
            return new Pravougaonik(5, 10);
        } return null;
    }
}
