import java.lang.Exception;
import java.util.Scanner;
public class exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 100){
            try{
                //throw new MyException();
                throw new ArithmeticException("This is an Arithmatic exception");
            }
            catch(Exception e){
                //System.out.println(e.getMessage());
                //System.out.println(e.toString());
                //System.out.println(e);
                e.printStackTrace();
                System.out.println("this will also run");
            }
        }
    }
}
class MyException extends Exception{
    /*public String getMessage(){
        return "I am get message()";
    }*/
    public String toString(){
        return super.toString();
    }
}