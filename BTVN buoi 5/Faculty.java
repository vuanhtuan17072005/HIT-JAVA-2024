import java.util.Scanner;
public class Faculty {
    private String Name;
    private String Date;
    private School x;
    public Faculty() {
        x = new School();
    }
    public Faculty(String Name, String Date, School x) {
        this.Name=Name;
        this.Date=Date;
        this.x=x;
    }
    public String getName(){
        return Name;
    }
    public String getDate(){
        return Date;
    }
    public School getX(){
        return x;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }
    public void setX(School x) {
        this.x = x;
    }
    public void nhap1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Faculty's Name :");
        Name = sc.nextLine();
        System.out.print("Faculty's Date :");
        Date = sc.nextLine();
        x.nhap();
    }
    public void xuat1(){
        System.out.println("Faculty's Name :"+Name);
        System.out.println("Faculty's Date :"+Date);
        x.xuat();
    }
}
