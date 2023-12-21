package methodQuestion;
import java.util.*;
public class que1 {
    static void table(int n){
        for(int i = 1; i<= 10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
}
