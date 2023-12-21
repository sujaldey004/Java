package ArrayQuestion;
import java.util.*;
public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five floating numbers = ");
        Float n[] = new Float[5];
        for(int i = 0;i < n.length;i++){
            n[i] = sc.nextFloat();
        }
        float sum = 0;
        for(float element : n){
            System.out.print(element);
            System.out.print(" ");
            sum = sum + element;
        }

        System.out.println("");
        System.out.println("The sum is = "+sum);
    }
}
