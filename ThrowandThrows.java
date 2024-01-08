class NegativeRadiusexception extends Exception{
    public String getMessage(){
        return "Radius cannot be in Negative";
    }
}
public class ThrowandThrows {
    public static double area(int r) throws NegativeRadiusexception{
        if(r<0){
            throw new NegativeRadiusexception();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
        try{
            double a = area(6378);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());;
        }
    }
}
