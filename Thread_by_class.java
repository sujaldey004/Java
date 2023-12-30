// Implementing Thread by class
class Thread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("This is thread 1");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("This is thread 2");
        }
    }
}
public class Thread_by_class {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
