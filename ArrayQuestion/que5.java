package ArrayQuestion;
import java.util.*;
public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" elements of array = ");
        int n[] = new int[size];
        for(int i = 0; i < size; i++){
            n[i] = sc.nextInt();
        }
        for(int i = n.length - 1; i >= 0 ;i--){
            System.out.print(n[i]+" ");
        }
    }    
}
