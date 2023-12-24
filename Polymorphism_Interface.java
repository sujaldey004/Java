// Polymorphism in Interface 

interface Camera{
    void picture();
    void record();
}

interface mediaPlayer{
    void Playmusic();
    void Playvideo();
}

class dabbaPhone{
    void call(){
        System.out.println("calling ....");
    }
    void sms(){
        System.out.println("sending sms ....");
    }
}

class tagdaPhone extends dabbaPhone implements Camera, mediaPlayer{
    public void picture(){
        System.out.println("click photo ....");
    }
    public void record(){
        System.out.println("recording video ....");
    }
    public void Playmusic(){
        System.out.println("Playing music ....");
    }
    public void Playvideo(){
        System.out.println("Playing video ....");
    }

    public void Gps(){
        System.out.println("Location turning on...");
    }
}

public class Polymorphism_Interface {
    public static void main(String[] args) {
        mediaPlayer mp = new tagdaPhone();

        /*mp.picture();
        mp.record();*/   // ---> We can only use mediaPlayer method

        mp.Playmusic();
        mp.Playvideo();

        tagdaPhone tp = new tagdaPhone();
        // Now we can use all methods
        tp.Gps();
        tp.call();
        tp.sms();
        tp.picture();
        tp.record();
        tp.Playmusic();
        tp.Playvideo();

    }
}
