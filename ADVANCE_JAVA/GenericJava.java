package ADVANCE_JAVA;

public class GenericJava {
    public static void main(String[] args) {
        mygeneric<String, Integer> gen = new mygeneric<>(19, "SujalDey", 20);   // this code show some warning but if you run it directly it will work properly
        String str = gen.gett1();
        System.out.println(str);
        System.out.println(gen.getval());
        System.out.println(gen.gett2());
    }
}
class mygeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;
    mygeneric(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    public int getval(){
        return val;
    }
    public T1 gett1(){
        return t1;
    }
    public T2 gett2(){
        return t2;
    }
}