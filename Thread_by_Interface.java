class Thread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("This is Thread 1");
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("T2");
        }
    }
}
public class Thread_by_Interface {
    public static void main(String[] args) {
        Thread1 g1 = new Thread1();
        Thread t1 = new Thread(g1);

        Thread2 g2 = new Thread2();
        Thread t2 = new Thread(g2);

        t1.start();
        t2.start();
    }
}
