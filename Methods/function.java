package Methods;

public class function {
    /*

//Method invocation by simple trick

    static int methods(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = methods(a,b);
        int a1 = 2;
        int b1 = 1;
        int c1 = methods(a1, b1);
        System.out.println("Answer is = "+c);
        System.out.println("Answer is = "+c1);
    }
    */






    /* 


//Method invocation by creting object


    int methods(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        function obj = new function();
        int a = 5;
        int b = 7;
        int c = obj.methods(a,b);
        System.out.println("Answer = "+c);
        int a1 = 2;
        int b1 = 1;
        int c1 = obj.methods(a1, b1);
        System.out.println("Answer = "+c1);
    }
    */
}


