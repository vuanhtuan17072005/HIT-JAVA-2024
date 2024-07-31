import java.util.Scanner;
public class Bai_1 {
    public static final String SQUARE ="Square";
    public static final String TRIANGLE ="Triangle";
    public static final String CIRCLE ="Circle";
    public static final double PI=Math.PI;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập hình :");
        String nh = sc.nextLine();
        if(nh.equals(SQUARE)){
            System.out.println("Yêu cầu của bạn la tính diện tích hình vuông");
            System.out.println("Mời bạn nhập số nguyên a=");
            Scanner sc1 = new Scanner(System.in);
            int a = sc1.nextInt();
            while(a<=0){
                System.out.print("Mời bạn nhập lại số nguyên dương a=");
                a = sc1.nextInt();
            }
            System.out.println("Chúc mừng bạn nhập thành công a="+a);
            double dthv = Math.pow(a,2);
            System.out.println("Diện tích hinh vuông là :"+dthv);
        }
        else if(nh.equals(TRIANGLE)){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Mời bạn nhập 3 cạnh của tam giác lần lượt là :");
            int a = sc2.nextInt();
            int b = sc2.nextInt();
            int c = sc2.nextInt();
            if (a+b<=c || b+c<=a || a+c<=b){
                System.out.println("-1");
            }
            else {
                double p = (a + b + c) / 2;
                double dttg = Math.sqrt(p * (p - a) + p * (p - b) + p * (p - c));
                System.out.println("Diện tích tam giác là :" + (double) Math.round(dttg * 1000) / 1000);
            }
        }
        else if(nh.equals(CIRCLE)){
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Mời bạn bán kính (r>0) r=");
            int r = sc3.nextInt();
            while(r<=0){
                System.out.print("Bạn đã nhập bán kính r sai yêu câu nhập lại r=");
                r = sc3.nextInt();
            }
            double dtht=PI*Math.pow(r,2);
            System.out.println("Diện tích của hinh tròn là :"+(double)Math.round(dtht * 100)/100);
        }
        else {
            System.out.println("Bạn nhập ngu rồi yêu cầu chạy lại chương trình ");
        }
    }
}
