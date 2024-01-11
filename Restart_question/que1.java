package Restart_question;

public class que1 {
    public static void main(String[] args) {
        int a = 666;
        int b = 7;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException e ){
                System.out.println("HaHa");
                break;
            }
            catch(IllegalArgumentException e){
                System.out.println("HeHe");
            }
            b--;
        }
    }
}
