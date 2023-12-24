package Abstract_question;
public class question1 {
    public static void main(String[] args) {
        fountainpen fp = new fountainpen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    public void write(){
        System.out.println("writing...");
    }
    public void refill(){
        System.out.println("refelling...");
    }
    public void changeNib(){
        System.out.println("changing nib...");
    }
}