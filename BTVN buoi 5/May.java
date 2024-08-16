import java.util.Scanner;
public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    public May() {

    }
    public May(String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }
    public String getMaMay() {
        return MaMay;
    }
    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }
    public String getTenMay() {
        return TenMay;
    }
    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }
    public String getTinhTrang() {
        return TinhTrang;
    }
    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    public void nhap2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("MaMay :");
        MaMay = sc.nextLine();
        System.out.print("TenMay :");
        TenMay = sc.nextLine();
        System.out.print("TinhTrang :");
        TinhTrang = sc.nextLine();
    }
    public void xuat2() {
        System.out.println("MaMay :" + MaMay);
        System.out.println("TenMay :" + TenMay);
        System.out.println("TinhTrang :" + TinhTrang);
    }

}
