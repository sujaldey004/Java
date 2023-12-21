package ArrayQuestion;
import java.util.*;
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students are there = ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" students number = ");
        float var[] = new float[n];
        for(int i = 0;i < n;i++){
            var[i] = sc.nextFloat();
        }
        float avg = 0;
        for(Float num : var){
            avg = avg + num;
        }
        System.out.println("The average is = "+avg/n);
    }
}
