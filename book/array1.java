package book;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        System.out.print("Enter how many days temperature you have = ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        double temperature[] = new double[days];
        System.out.println("Enter "+days+" days temperature = ");
        double sum = 0;
        for(int i = 0; i < days; i++){
            temperature[i] = sc.nextDouble();
            sum  = sum+temperature[i];
        }
        System.out.print("The average temperature is = ");
        double average = sum/days;
        System.out.println(average);
        /*for(int i = 0; i < days; i++){
            if(temperature[i] < average){
                System.out.println(temperature[i]+" -> is below average temperature.");
            }
            else if( temperature[i] > average){
                System.out.println(temperature[i]+" -> is above average temperature.");
            }
            else{
                System.out.println(temperature[i]+" is average temperature");
            }
        }*/

        System.out.println("Enter the temperature want to compare = ");
        double input = sc.nextDouble();
        if(input < average){
            System.out.println(input+ " is below average temperature.");
        }
        else if(input > average){
            System.out.println(input+ " is above average temperature.");
        }
        else{
            System.out.println(input+" is the average temperature.");
        }
    }
}
