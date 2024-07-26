import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        final float Pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập bán kính (0<r<1000) r=");
        float r = sc.nextFloat();
        while (r<=0 || r>=1000){
            System.out.print("Mời bạn nhập lại r=");
            r = sc.nextFloat();
        }
        System.out.println("Chúc mừng bạn nhập thành công bán kính r="+r);
        float cv = 2*Pi*r;
        float dt = (float) Math.pow(r,2) *Pi;
        System.out.println("Chu vi và diện tích khi làm tròn tới số thập phân thứ 3 lần lượt là :");
        System.out.format("%.3f",cv);
        System.out.print("  ");
        System.out.format("%.3f",dt);
    }
}