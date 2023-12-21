package ArrayQuestion;

public class que8 {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,7,8,9,10};
        boolean m = true;
        for(int i = 0; i < n.length-1; i++){
            if(n[i] > n[i+1]){
                m = false;
                break;
            }
        }
        if(m == false){
            System.out.println("This array is not sorted.");
        }
        else{
            System.out.println("This array is sorted.");
        }
    }
}
