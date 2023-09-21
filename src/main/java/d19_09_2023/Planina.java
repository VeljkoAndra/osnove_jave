package d19_09_2023;

public class Planina {
    private String imePlanine;
    private String imeDrzaveGdeSeNalazi;
    private double visinaPlanine;

    public Planina() {
    }

    public Planina(String imePlanine, String imeDrzaveGdeSeNalazi, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.imeDrzaveGdeSeNalazi = imeDrzaveGdeSeNalazi;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getImeDrzaveGdeSeNalazi() {
        return imeDrzaveGdeSeNalazi;
    }

    public void setImeDrzaveGdeSeNalazi(String imeDrzaveGdeSeNalazi) {
        this.imeDrzaveGdeSeNalazi = imeDrzaveGdeSeNalazi;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
