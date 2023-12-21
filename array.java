import java.util.*;
public class array {
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5};
        String []name = {"sam", "rahul", "neha", "vishal", "rihan"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers = ");
        for(int i = 0;i < 5;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Length of array is "+marks.length);
        for(int i = 0;i<5;i++){
            System.out.println("Marks of "+i+ " is "+marks[i]);
        }
        System.out.println("Second student is = "+name[1]);

        for(String element : name){
            System.out.println(element);
        }
        for(int ele : marks){
            System.out.println(ele);
        }
    }
}
