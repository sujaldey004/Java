class Base{
    Base(){
        System.out.println("this is Base constructor");
    }
    Base (int n){
        System.out.println("Base no. is = "+n);
    }
}
class Derived extends Base{
    Derived(){
        //super(99);
        System.out.println("this is Derived constrctor");
    }
    Derived(int n, int m){
        super(n);
        System.out.println("Derived value is = "+m);
    }
}
class childofderived extends Derived{
    childofderived(int n, int m, int o){
        super(n, m);
        System.out.println("childofderived's value is = "+o);
    }
}

public class ep9 {
    public static void main(String[] args) {
        //Base b = new Base();
        //Derived d = new Derived();
        //Derived d = new Derived(69,96);
        childofderived cd = new childofderived(69, 96, 88);
    }
}
