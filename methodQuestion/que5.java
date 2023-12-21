package methodQuestion;

public class que5 {
    static int fibo(int n){
        if(n == 1 || n == 2){
            return n-1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int result = fibo(5);
        System.out.println(result);
    }
}
