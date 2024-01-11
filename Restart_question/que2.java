package Restart_question;

import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a index number = ");
        int index;
        int i = 0;
        while(i < 5){
            index = sc.nextInt();
            try{
                System.out.println("The value at index is = "+arr[index]);
                break;
            }
            catch(Exception e){
                System.out.println("invalid index");
                i++;
            }
        }
        System.out.println("ERROR");
    }
}
