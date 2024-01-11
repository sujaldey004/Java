public class Finally_block {
    public static int demo(){
        int a = 50;
        int b = 2;
        try{
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println("Cannot divide by zero");
        }
        finally{           //  Finally keyword cannot be used without try-catch
            System.out.println("Execute this also");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = demo();
        System.out.println(k);
    }
}
