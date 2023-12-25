package Abstract_question;
// Inheritance in Interface example
public class question4 {
    public static void main(String[] args) {
        television tv = new television();
        tv.poweron();
        tv.volume_up();
        tv.volume_down();
        tv.poweroff();
    }
}
interface tv_remote{
    void poweron();
    void poweroff();
}
interface samrt_tv_remote extends tv_remote{
    void volume_down();
    void volume_up();
}
class television implements samrt_tv_remote{
    public void poweroff(){
        System.out.println("Power off...");
    }
    public void poweron(){
        System.out.println("Power on...");
    }
    public void volume_up(){
        System.out.println("Turning volume up");
    }
    public void volume_down(){
        System.out.println("Turning volume down");
    }
}