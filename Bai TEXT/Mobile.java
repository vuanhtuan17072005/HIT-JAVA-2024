import javax.swing.*;

public class Mobile extends SanPham{
    protected String Hangsp;
    protected String Ram;
    public Mobile(){
    }
    public Mobile(String id, String name, int price, int total,String Hangsp,String Ram){
        this.Hangsp = Hangsp;
        this.Ram = Ram;
        this.id=id;
        this.name=name;
        this.price=price;
        this.total=total;
    }
    public String getHangsp() {
        return Hangsp;
    }
    public void setHangsp(String Hangsp) {
        this.Hangsp = Hangsp;
    }
    public String getRam() {
        return Ram;
    }
    public void setRam(String Ram) {
        this.Ram = Ram;
    }
    public double GetTotalPrice(){
        return getTotalPrice() + 0.2 * 30000;
    }

}
