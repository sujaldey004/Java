abstract class parent{
    abstract public void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("helloo");
    }
}
public class ep13 {
    public static void main(String[] args) {
        child c = new child();
        c.greet();
    }
}