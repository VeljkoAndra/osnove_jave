package p14_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        TestStep step1 = new TestStep("Open app","", "", "Aplikacije nije otvorena");
        TestStep step2 = new TestStep(" Check if login link is visible","","", "");
        TestStep step3 = new TestStep("Click on login link","","", "Nije moguce klinuti");
        TestStep step4 = new TestStep("Click on login link","","", "Nije miguce klinuti");
        TestStep step5 = new TestStep("Check if form is visible","not visible","visible", "Nije vidljiva");
        TestStep step6 = new TestStep("Enter username","","", "Nije moguce uneti username.");
        TestStep step7 = new TestStep("Enter password","Nemoguce uneti pasword","Pasword je unet", "Nije moguce uneti pasword.");
        TestStep step8 = new TestStep("Check if login button is visible","","", "");
        TestStep step9 = new TestStep(" Click on login button","klikljivo","klikljivo", "Nije moguce klinuti.");
        TestStep step10 = new TestStep("User should be logged","nije logovan","logovan", "Nije se logovalo.");


        TestCase case1= new TestCase(001, "Provera logovanja.");
        case1.addTestStep(step1);
        case1.addTestStep(step2);
        case1.addTestStep(step3);
        case1.addTestStep(step4);
        case1.addTestStep(step5);
        case1.addTestStep(step6);
        case1.addTestStep(step7);
        case1.addTestStep(step8);
        case1.addTestStep(step9);
        case1.addTestStep(step10);

        case1.stampanje();


    }
}
