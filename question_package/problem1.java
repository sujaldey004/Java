package question_package;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("this is running");
        HybridCalculator hc = new HybridCalculator();
        hc.Calculate(4, 5);
    }
}
class Calculator{
    public void Calculate(int a,int b){
        System.out.println("the result is = "+(a+b));
    }
}
class ScCalculator{
    public void Calculate(int a, int b){
        System.out.println("The result is = "+Math.sin(a+b));
    }
}
class HybridCalculator{
    public void Calculate(int a, int b){
        System.out.println("The result is = "+Math.sin(a+b));
        System.out.println("The result is = "+(a+b));
    }
}