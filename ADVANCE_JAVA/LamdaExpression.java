package ADVANCE_JAVA;


@FunctionalInterface  // Interface with single method
interface lamda {
    public void v1();
}

public class LamdaExpression{
    public static void main(String[] args) {
        lamda obj = ()->{
            System.out.println("I am Lamda Expression");
        };
        obj.v1();
    }
}