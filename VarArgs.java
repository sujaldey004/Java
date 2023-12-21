public class VarArgs {
    static int arr(int ...arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 9 is = "+arr(4,9));
        System.out.println("The sum of 200 and 99999999 is = "+arr(200,99999999));
    }
}
