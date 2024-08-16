import java.util.Scanner;
public class QuanLy {
    private String MaQL;
    private String HoTen;
    public QuanLy() {

    }
    public QuanLy(String MaQL, String HoTen) {
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }
    public String getMaQL() {
        return MaQL;
    }
    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public void nhap1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("MaQL: ");
        MaQL = sc.nextLine();
        System.out.print("HoTen: ");
        HoTen = sc.nextLine();
    }
    public void xuat1(){
        System.out.println("MaQL: " + MaQL);
        System.out.println("HoTen: " + HoTen);
    }
}
