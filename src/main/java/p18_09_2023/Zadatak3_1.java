package p18_09_2023;

public class Zadatak3_1 {
    public static void main(String[] args) {

    FigureGenerator generator = new FigureGenerator();
    Figura t1 = generator.figureGenerator("trougao");
    Figura t2 = generator.figureGenerator("trougao");
    Figura t3 = generator.figureGenerator("trougao");
    Figura p1 = generator.figureGenerator("pravougaonik");
    Figura p2 = generator.figureGenerator("pravougaonik");

        t1.stampaj();
        t2.stampaj();
        t3.stampaj();
        p1.stampaj();
        p2.stampaj();
    }
}
