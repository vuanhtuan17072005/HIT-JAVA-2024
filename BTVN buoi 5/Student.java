import java.util.Scanner;
public class Student {
    private String Name;
    private String Class;
    private double Score;
    public Faculty y;
    public Student() {
        y= new Faculty();
    }
    public Student(String Name, String Class, double Score, Faculty y) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String Class(){
        return Class;
    }
    public void setClass(String Class){
        this.Class = Class;
    }
    public double getScore() {
        return Score;
    }
    public void setScore(double Score) {
        this.Score = Score;
    }
    public Faculty getY() {
        return y;
    }
    public void setY(Faculty y) {
        this.y = y;
    }
    public void nhap2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Student's Name: ");
        Name = sc.nextLine();
        System.out.print("Student's Class: ");
        Class = sc.nextLine();
        System.out.print("Student's Score: ");
        Score = sc.nextDouble();
        y.nhap1();
    }
    public void xuat2(){
        System.out.println("Student's Name: " + Name);
        System.out.println("Student's Class: " + Class);
        System.out.println("Student's Score: " + Score);
        y.xuat1();
    }
}
