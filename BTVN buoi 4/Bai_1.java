public class Bai_1 {
    private String ten;
    private String Address;
    private int TX1;
    private int TX2;
    private int KTHP;
    private int sotietnghi;
    private int years;
    Bai_1(String ten, String Address,int years, int TX1, int TX2,int KTHP, int sotietnghi) {
        this.ten = ten;
        this.Address = Address;
        this.TX1 = TX1;
        this.TX2 = TX2;
        this.KTHP = KTHP;
        this.sotietnghi = sotietnghi;
        this.years = years;
    }
    public void display(){
        int Age = 2024 - years;
        double GPA=(TX1*0.2 + TX2 * 0.3 + KTHP* 0.5);
        System.out.println(ten + " " + Address + " " + Age + " " + TX1 + " " + TX2 + " " + KTHP + " " + GPA + " " + sotietnghi);
    }
    public static void main(String[] args) {
        Bai_1 Student1 = new Bai_1("Tuấn","Bắc Ninh",2005,9,8,9,0);
        Student1.display();
        Bai_1 Student2 = new Bai_1("Long","Hải Dương",2005,8,7,7,2);
        Student2.display();
        Bai_1 Student3 = new Bai_1("Chung","Hải Phòng",2005,7,7,8,1);
        Student3.display();
        Bai_1 Student4 = new Bai_1("Trường","Lào Cai",2005,9,9,9,0);
        Student4.display();
        Bai_1 Student5 = new Bai_1("Tùng","Hà Nam",2005,8,7,9,0);
        Student5.display();
    }
}
