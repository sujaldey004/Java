/*class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Its running");
    }
}

public class Thread_constructor {
    public static void main(String[] args) {
        MyThread mt = new MyThread("sam");
        mt.start();
        System.out.println("Thread id = "+mt.getId());
        System.out.println("Thread name = "+mt.getName());
    }
}
*/



class TH implements Runnable{
    public void run(){
        System.out.println("Its running");
    }
}
public class Thread_constructor{
    public static void main(String[] args) {
        TH t = new TH();
        Thread tt = new Thread(t,"sam");
        Thread tp = new Thread(t,"asher");

        tt.start();
        System.out.println("Thread id "+tt.getId());
        System.out.println("Thread id "+tp.getId());
        System.out.println("Thread name "+tt.getName());
        System.out.println("Thread name "+tp.getName());
    }
}