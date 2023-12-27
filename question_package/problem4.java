package question_package;
import question_package.que3_with_que2.que2.problem2;
public class problem4 {
    public static void main(String[] args) {
        System.out.println("this will show protected variable not defaul = ");
        faltu f = new faltu();
        f.function();
    }
}
class faltu extends problem2{
    void function(){
        System.out.println(v);
        //System.out.println(d);
    }
}