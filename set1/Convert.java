package set1;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        System.out.print("Enter Distance in km = ");
        Scanner km = new Scanner(System.in);
        int miles = km.nextInt();
        System.out.println("Distance in miles is = " + miles*0.621371);
    }
}
