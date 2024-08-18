import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Mobile [] mobile = new Mobile[5];
        for(int i = 0; i < mobile.length; i++) {
            Scanner scan = new Scanner(System.in);
            String id = scan.nextLine();
            String name = scan.nextLine();
            int price = scan.nextInt();
            int total = scan.nextInt();
            String Hangsp = scan.nextLine();
            String Ram = scan.nextLine();
            mobile[i]=new Mobile(id,name,price,total,Hangsp,Ram );
            scan.nextLine();
        }
        for(Mobile m : mobile) {
            System.out.println(m.getId() + " " + m.getName() + " " + m.getPrice() + " " + m.getTotal() + " " + m.getHangsp()+ " " + m.getRam()+" "+ m.GetTotalPrice());
        }


    }
}
