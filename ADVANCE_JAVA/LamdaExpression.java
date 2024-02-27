package ADVANCE_JAVA;

public class LamdaExpression{     // Lamda Expression only work for Functional interface
    public static void main(String[] args) {
        nothing u = (a)->{
            System.out.println("I am Lamda Expression " + a);
        };
        u.n(5);
    }
}

@FunctionalInterface  // Functional Interface is an interface in which we only one single method
interface nothing {
    void n(int a);
}
