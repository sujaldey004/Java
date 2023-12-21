package ArrayQuestion;
import java.util.*;
public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = {11,12,13,14,15};
        System.out.print("Enter number want to search = ");
        int num = sc.nextInt();
        int ans = 0;
        for(int i = 0;i < n.length;i++){
            if(num == n[i]){
                ans = 1;
            }
        }
        if(ans == 1){
            System.out.println("Yes, this element is present in array.");
        }
        else{
            System.out.println("No, this element is not present in array.");
        }
    }
}
