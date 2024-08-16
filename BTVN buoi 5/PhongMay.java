import java.util.Scanner;
public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private String DienTich;
    private QuanLy x;
    private May y;
    private Integer n;
    public PhongMay() {
        x = new QuanLy();
        y = new May();
    }
    public PhongMay(String MaPhong, String TenPhong, String DienTich, QuanLy x, May y, Integer n) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    public String getMaPhong() {
        return MaPhong;
    }
    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }
    public String getTenPhong() {
        return TenPhong;
    }
    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }
    public String getDienTich() {
        return DienTich;
    }
    public void setDienTich(String DienTich) {
        this.DienTich = DienTich;
    }
    public QuanLy getX() {
        return x;
    }
    public void setX(QuanLy x) {
        this.x = x;
    }
    public May getY() {
        return y;
    }
    public void setY(May y) {
        this.y = y;
    }
    public Integer getN() {
        return n;
    }
    public void setN(Integer n) {
        this.n = n;
    }
    public void nhap3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("MaPhong :");
        MaPhong = sc.nextLine();
        System.out.print("TenPhong :");
        TenPhong = sc.nextLine();
        System.out.print("DienTich :");
        DienTich = sc.nextLine();
        x.nhap1();
        y.nhap2();
        System.out.print("Số học sinh ở trong lóp n=");
        n = sc.nextInt();
    }
    public void xuat3(){
        System.out.println("MaPhong :" + MaPhong);
        System.out.println("TenPhong :" + TenPhong);
        System.out.println("DienTich :" + DienTich);
        x.xuat1();
        y.xuat2();
        System.out.println("Số sinh viên trong lớp là :"+n);
    }
}
