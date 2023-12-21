package set1;
import java.util.*;
class drive{
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("You are eligible for driving vehicle.");
        }
        else
        System.out.println("You are not eligible");
    }
}