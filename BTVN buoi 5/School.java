import java.util.Scanner;
public class School {
    private String name;
    private String Date;
    public School() {

    }
    public School(String name, String Date) {
        this.name = name;
        this.Date = Date;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("school's name :");
        name = sc.nextLine();
        System.out.print("school's date:");
        Date = sc.nextLine();
    }
    public void xuat(){
        System.out.println("school's name: "+name);
        System.out.println("school's date:"+Date);
    }
}
