import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số nguyên dương n=");
        int n = sc.nextInt();
        while( n<=0)
        {
            System.out.print("Mời bạn nhập n=");
            n = sc.nextInt();
        }
        System.out.println("Chúc mừng bạn nhập thành công n ="+n);
        int [] a = new int[n];
        System.out.println("Mời bạn nhập giá trị vào mảng a :");
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i] =sc.nextInt();
        }
        System.out.println("Gía trị của mảng a bạn vừa nhập là :");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.print("\n");
        for(int i=1;i<n;i++)
            if(i%2!=0){
                int s1=a[i-1]-a[i+1];
                a[i]=Math.abs(s1) + a[i];
            }
        System.out.println("Mảng a mới là :");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
