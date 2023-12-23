interface phone{
    void ringing();
    void calling();
}
class smartphone implements phone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void calling(){
        System.out.println("calling...");
    }
}
public class ep14 {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.calling();
        sp.ringing();
    }
}
