interface sampleinterface{
    void meth1();
    void meth2();
}

interface sampleinterfacechild extends sampleinterface{
    void meth3();
    void meth4();
}

class sample implements sampleinterfacechild{
    public void meth1(){
        System.out.println("This is method 1");
    }
    public void meth2(){
        System.out.println("This is method 2");
    }
    public void meth3(){
        System.out.println("This is method 3");
    }
    public void meth4(){
        System.out.println("This is method 4");
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {
        sample s = new sample();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
