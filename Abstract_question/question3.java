package Abstract_question;

public class question3 {
    public static void main(String[] args) {
        /*Telephone t = new smartTelephone();    // This is polymorphism
        t.disconnect();
        t.lift();
        t.ring();
        // t.yt();    --> can't use*/

        smartTelephone st = new smartTelephone();
        st.disconnect();
        st.lift();
        st.ring();
        st.yt();
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends Telephone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void lift(){
        System.out.println("Lifting...");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }
    public void yt(){
        System.out.println("playing yt...");
    }
}