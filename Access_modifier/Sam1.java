package Access_modifier;
public class Sam1 {
    public static void main(String[] args) {
        abc sc = new abc();
        //sc.meth1();
        System.out.println(sc.p);
        System.out.println(sc.q);
        System.out.println(sc.r);
        //System.out.println(sc.s);     --> Private methods and properties can only used in its own class
    }
}
class abc{
    public int p = 1;
    protected int q = 2;
    int r = 3;
    private int s = 4;
    public void meth1(){
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}

