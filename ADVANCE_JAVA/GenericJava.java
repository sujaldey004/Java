package ADVANCE_JAVA;

public class GenericJava {
    public static void main(String[] args) {
        mygeneric<String> gen = new mygeneric(19, "SujalDey");   // this code show some warning but if you run it directly it will work properly
        String str = gen.gett1();
        System.out.println(str);
        System.out.println(gen.getval());
    }
}
class mygeneric<T1>{
    int val;
    T1 t1;
    mygeneric(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }
    public int getval(){
        return val;
    }
    public T1 gett1(){
        return t1;
    }
}