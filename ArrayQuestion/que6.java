//Maximum element in array

package ArrayQuestion;
class que6{
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,66,7,8,99,10};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n.length;i++){
            if(n[i] > max){
                max = n[i];
            }
        }
        System.out.println("The maximum in array is = "+max);
    }
}