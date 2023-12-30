// Thread Methods
class Th1 extends Thread{
    public void run(){
        int i = 0;
        while(i< 1000){
            System.out.println("Its running");
            i++;
            try {
                Thread.sleep(999);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Th2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 2000){
            System.out.println("Now started");
            i++;
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        Th1 t1 = new Th1();
        Th2 t2 = new Th2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
