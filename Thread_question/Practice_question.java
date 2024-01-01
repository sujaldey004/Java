package Thread_question;

public class Practice_question {
    public static void main(String[] args) {

        gm g = new gm();
        welc w = new welc();
        //g.setPriority(4);
        //w.setPriority(9);
        g.setPriority(Thread.MAX_PRIORITY);
        w.setPriority(Thread.MIN_PRIORITY);
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
        w.start();
        g.start();
        //System.out.println(w.getState());
        //System.out.println(g.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getState());
    }
}
class gm extends Thread{
    public void run(){
        int i = 0;
        while(i < 20){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good morning");
            i++;
        }
    }
}
class welc extends Thread{
    public void run(){
        int i = 0;
        while(i < 20){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcome");
            i++;
        }
    }
}