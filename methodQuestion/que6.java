package methodQuestion;

public class que6 {
    static float arr(float ...arr){
        float result = 0;
        int size = arr.length;
        for(int i = 0; i < arr.length;i++){
            result = arr[i]+result;
        }
        return result/size;
    }
    public static void main(String[] args) {
        System.out.println("the average of 5,4,3,2,1 is = "+arr(24,55,17,87,100));
    }
}
