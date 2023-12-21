//Dynamic method dispatch in java
class phone{
    public void time(){
        System.out.println("You dont have much time left.");
    }
    public void call(){
        System.out.println("Phone is ringing...");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void call(){
        System.out.println("Smartphone is ringing...");
    }
}

public class ep11 {
    public static void main(String[] args) {
        phone x = new smartphone();
        x.call();
        x.time();
        // x.music();      --> not allowed
    }
}
