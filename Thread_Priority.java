// Thread priority 
class anything extends Thread{
    anything(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("Its running "+ this.getName());
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        anything a1 = new anything("1");
        anything a2 = new anything("sam2");
        anything a3 = new anything("sam3");
        a1.setPriority(Thread.MAX_PRIORITY);
        a2.setPriority(Thread.NORM_PRIORITY);
        a3.setPriority(Thread.MIN_PRIORITY);
        a1.start();
        a2.start();
        a3.start();
    }
}
