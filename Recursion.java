import java.util.Scanner;

class Recursion {
/*    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        } 
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("The factorial of 5 is = "+factorial(5));
    }
    */

    static int fibo(int x){
        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }
        else{
            return fibo(x-1)+fibo(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of term = ");
        n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        for(int i = 2;i<n;i++){
            System.out.print(" "+fibo(i));
        }
    }
}
