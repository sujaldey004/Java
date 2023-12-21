package methodQuestion;
import java.util.*;
public class que4 {
    static void patter2(int n){
        for(int i = n-1;i >= 0;i--){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines = ");
        int n = sc.nextInt();
        patter2(n);
    }
}
