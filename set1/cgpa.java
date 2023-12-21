package set1;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        System.out.print("Enter physics marks = ");
        Scanner ptg = new Scanner(System.in);
        float a = ptg.nextFloat();
        System.out.print("Enter chemistry marks = ");
        float b = ptg.nextFloat();
        System.out.print("Enter maths marks = ");
        float c = ptg.nextFloat();
        float  n = (a+b+c)/30;
        System.out.println("Your CGPA is = "+n);
    }
}
