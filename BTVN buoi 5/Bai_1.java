import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số sinh viên cần lập n=");
        int n = sc.nextInt();
        Student []students = new Student[n];
        for (int i = 0; i < n+1; i++) {
            System.out.println("Mời bạn nhập sinh viên thứ "+(i+1)+":");
            students[i] = new Student();
            students[i].nhap2();
            students[i].xuat2();
        }
    }
}
