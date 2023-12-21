import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n position = ");
        int n = sc.nextInt();
        System.out.println("Even number till "+n+" position");
        for(int i = 0; i < n; i++){
            System.out.println(2*i);
        }
    }
}
