import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số nguyên dương (0<=n<=50) n=");
        int n = sc.nextInt();
        while (n<0 || n>50)
        {
            System.out.print("Mời bạn nhập lại  n=");
            n = sc.nextInt();
        }
        System.out.println("Chúc mừng bạn nhập thành công n="+n);
        int [][] a= new int[n][n];
        System.out.println("Mời bạn nhập giá trị vào ma trận a:");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Ma trận a bạn vừa nhập là :");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
