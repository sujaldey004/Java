package methodQuestion;
import java.util.*;
public class que3 {
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n = ");
        int n = sc.nextInt(); 
        System.out.println("Sum of the series = "+sum(n));
    }
}
