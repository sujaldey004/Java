package practice_package;

import Access_modifier.For_Example;
public class sam2{
    public static void main(String[] args) {
        subclass f = new subclass();
        f.meth2();                         // --> we can use Protected methods and properties in subclasses
    }
}
class subclass extends For_Example{       //  --> We are creating subclass which inherits properties of For_Example class
    void meth2(){                         //  --> We have to create a method to use properties of anpther package
        System.out.println(p);
        System.out.println(q);
        //System.out.println(r);
        //System.out.println(s);
    }    
}