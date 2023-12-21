import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter marks out of 100.");
        Scanner mrks = new Scanner(System.in);
        System.out.print("Enter maths marks = ");
        float gani = mrks.nextInt();
        System.out.print("Enter science marks = ");
        float vig = mrks.nextInt();
        System.out.print("Enter hindi marks = ");
        float hin = mrks.nextInt();
        System.out.print("Enter english marks = ");
        float eng = mrks.nextInt();
        System.out.print("Enter sanskrit marks = ");
        float sans = mrks.nextInt();
        float per = (gani+vig+hin+eng+sans)/500;
        System.out.print("Your pecentage is = " + per*100);
    }
}
