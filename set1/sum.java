package set1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.print("Enter first number = ");
        Scanner sum = new Scanner(System.in);
        float a = sum.nextFloat();
        System.out.print("Enter second number = ");
        float b = sum.nextFloat();
        System.out.print("Enter third number = ");
        float c = sum.nextFloat();
        System.out.println("Sum is = "+ (a+b+c));
    }
}
