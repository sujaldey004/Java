package methodQuestion;
import java.util.*;
public class que2 {
    static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines = ");
        int n = sc.nextInt();
        pattern(n);
    }
}
