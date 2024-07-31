import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi :");
        String chuoi = sc.nextLine();
        boolean check = checkchar(chuoi);
        if (check) {
            System.out.println("Chuỗi đối xứng nhau ta in hoa tất cả các chữ");
            System.out.println(chuoi.toUpperCase());
        } else {
            System.out.println("Không phải đối xứng lên ta vết thường tất cả :");
            System.out.println(chuoi.toLowerCase());
        }
    }

    public static boolean checkchar(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}