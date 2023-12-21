package ArrayQuestion;

public class que7 {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,-55,6,7,8,9,-10};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n.length;i++){
            if(n[i] < min){
                min = n[i];
            }
        }
        System.out.println("The minimum element in this array is = "+min);
    }
}
