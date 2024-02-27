package ADVANCE_JAVA;

public class anonymousClass {
    public static void main(String[] args) {
        // defgh sc = new defgh();
        // sc.meth1();
        // sc.meth2();

        abc sc = new abc() {              // anonymous class is an expression thats why after defining the class we put semi-colon as we do after every statement
            public void meth1(){
                System.out.println("I am method 1");
            }
            public void meth2(){
                System.out.println("I am method 2");
            }
        };
        sc.meth1();
        sc.meth2();
    }
}

interface abc{
    public void meth1();
    public void meth2();
}

/*class defgh implements abc{
    public void meth1(){
        System.out.println("I am method 1");      // we can use anonymous class to use interface methods once
    }
    public void meth2(){
        System.out.println("I am method 2");
    }
}
*/

