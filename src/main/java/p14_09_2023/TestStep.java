package p14_09_2023;

public class TestStep {
    private String opis;
    private String actualVrednost;
    private String expectedVrednost;
    private String errorMessage;

    public TestStep (String opis, String actualVrednost, String expectedVrednost,String errorMessage){
        this.opis=opis;
        this.actualVrednost=actualVrednost;
        this.expectedVrednost=expectedVrednost;
        this.errorMessage=errorMessage;
    }

    public boolean validnost(){
        if (actualVrednost.equals(expectedVrednost)){
            return true;
        }
        return false;
    }

    public void printanje(){
        System.out.println();
        System.out.println("| "+ opis + " |");
        if (validnost()==true){
            System.out.println("| "+"Status: passed"+ " |");
        } else if ( validnost()==false) {
            System.out.println("| "+"Status: failed" + " |" + errorMessage + " |");
        }
    }


    public String getOpis() {
        return opis;
    }

    public String getActualVrednost() {
        return actualVrednost;
    }

    public String getExpectedVrednost() {
        return expectedVrednost;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
