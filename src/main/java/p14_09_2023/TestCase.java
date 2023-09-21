package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private int iD;
    private String naziv;
    ArrayList <TestStep> stepovi;

public TestCase (int iD, String naziv){
    this.iD=iD;
    this.naziv=naziv;
    this.stepovi=new ArrayList<>();
}
public void addTestStep(TestStep step){
    this.stepovi.add(step);
}
public int failedTest(){
    int fail=0;
    for (int i= 0; i< stepovi.size();i++){
    if (stepovi.get(i).validnost()== false){
        fail=fail+1;
        }
    }
    return fail;
}
public String stanjeTestCaseva(){
    if (failedTest()!=0){
      return " FAILED";
    } else {
    return " PASSED";
    }
}

public void stampanje(){
    System.out.println(iD + " - "+ naziv);
    for (int i= 0; i< stepovi.size();i++) {
        stepovi.get(i).printanje();
    }
    System.out.println(stepovi.size() + " / " + failedTest());
    System.out.println("Stanje test case-a " + stanjeTestCaseva());
}



}
