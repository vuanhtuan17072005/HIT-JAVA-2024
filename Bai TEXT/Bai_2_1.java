public class Bai_2_1 {
    public static void main(String[] args) {
        SanPham[] sanPham = new SanPham[2];
        sanPham[0] = new SanPham("100","Chuối",2000,200);
        sanPham[1]= new SanPham("101","Táo",3000,300);
        for (int i = 0; i < sanPham.length; i++) {
            System.out.println(sanPham[i].toString());
        }
        for (int i = 0; i < sanPham.length; i++) {
            sanPham[i].display();
        }
    }

}
