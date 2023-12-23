interface phone{
    void ringing();
    void calling();
}
interface camera{
    void click();
    void record();
}
interface musicplayer{
    void playmusic();
    void stopmusic();
}
class smartphone implements phone,camera,musicplayer{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void calling(){
        System.out.println("calling...");
    }
    public void playmusic(){
        System.out.println("music playing..");
    }
    public void stopmusic(){
        System.out.println("music stop...");
    }
    public void click(){
        System.out.println("capturing picture...");
    }
    public void record(){
        System.out.println("recording video...");
    }
}
public class ep14 {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.calling();
        sp.ringing();
        sp.record();
        sp.click();
        sp.playmusic();
        sp.stopmusic();
    }
}
