import java.util.Random;
import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(11);
        int b = rand.nextInt(11);
        int c = rand.nextInt(21);
        boolean tong = (a + b == c);
        // Sinh ngẫu nhiên true hoặc false với xác suất 50%
        boolean result = Math.random() < 0.5 ? tong : !tong;
        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println(a+"+"+b+"="+c);
        boolean check2 = check(a,b,c);
        boolean Y=true;
        boolean N=false;
        System.out.print("Mời bạn chọn (Y/N):");
        String nhap=sc.nextLine();
        if(nhap.equals("Y") && Y==check2)
            System.out.println("Chính xác !");
        else if(nhap.equals("N") && N==check2)
            System.out.println("Chính xác !");
        else if(nhap.equals("N") && Y==check2)
            System.out.println("Bạn chọn chưa chính xác rồi !");
        else if(nhap.equals("Y") && N==check2)
            System.out.println("Bạn chọn chưa chính xác rồi !");
        else
            System.out.println("Bạn chọn tào nao nguuuuuuu");
    }
    public static boolean check(int a, int b, int c) {
        if(a+b==c){
            return true;
        }
        return false;
    }
}
