package Methods;
import java.util.*;
class prep{
    static int fibo(int n){
        if(n ==1 ){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term = ");
        int n = sc.nextInt();
        int result = fibo(n);
        System.out.println(result);
    }
}