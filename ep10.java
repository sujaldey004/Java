class ekclass{
    int a;
    public int geta(){
        return a;
    }
    ekclass(int x){
        this.a = x;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("this is a constructor");
    }
}
public class ep10 {
    public static void main(String[] args) {
        //ekclass e = new ekclass(69);
        doclass d = new doclass(5);
        System.out.println(d.geta());
    }
}
