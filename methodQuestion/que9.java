package methodQuestion;

public class que9 {
    static float temp(float c){
        float f = c * 9/5;
        return f+32;
    }
    public static void main(String[] args) {
        System.out.println("Convertion of 1 celsius into Fahrenheit is = "+temp(8));
    }
}
