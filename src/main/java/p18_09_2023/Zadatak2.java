package p18_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih student1= new StudentOsnovnih("Marko Marko", 534123, 4);
        StudentMaster student2 = new StudentMaster("Mirko Mirko", 1212312, 3);

        student1.stampaj();
        student2.stampaj();
    }
}
