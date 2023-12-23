interface myCamera{
    void portraitmode();
    void panormamode();


    // This is a default method and we have to implement its body in interface
    default void record4k(){
        System.out.println("Recording in 4k..");
    }

}


interface myNetwork{
    String[] availablewifi();
    void getwifi(String network);
}

// we can also use methods of this class also
class cellPhone{
    void callNumber(){
        System.out.println("caling...");
    }
    void pickCall(){
        System.out.println("say helloooo when pick...");
    }
}


class SamrtPhone extends cellPhone implements myCamera,myNetwork{
    public void portraitmode(){
        System.out.println("Portrait mode on...");
    }
    public void panormamode(){
        System.out.println("Panorma mode on...");
    }
    public String[] availablewifi(){
        System.out.println("Available wifi --> ");
         String[] networklist = {"A", "B", "c"};
         return networklist;
    }
    public void getwifi(String network){
        System.out.println("Connecting to "+network);
    }

    // We can override this method also
    @Override
    public void record4k(){
        System.out.println("Wait!   Switching to 4k...");
    }
}


public class UseOfDefault {
    public static void main(String[] args) {
        SamrtPhone sp = new SamrtPhone();
        sp.record4k();
        String[] a = sp.availablewifi();
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        sp.getwifi("A");
    }
}
