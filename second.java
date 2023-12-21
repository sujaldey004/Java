// sum of two numners

import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        System.out.println("Addition only.");
        Scanner plus = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = plus.nextInt();
        System.out.print("Enter second number = ");
        int b = plus.nextInt();
        System.out.print("The sum is = "+(a+b));
    }
}
