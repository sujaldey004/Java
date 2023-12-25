package Abstract_question;
public class question2 {
    public static void main(String[] args) {
        /*monkey m = new human();
        m.jump();
        m.bite();*/     // --> this is polymorphism, we have access of methods of monkey class


        human h = new human();    // we have access of all methods
        h.bite();
        h.jump();
        h.eat();
        h.sleep();
        h.talk();
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    public void jump(){
        System.out.println("Monkey is jumping...");
    }
    public void bite(){
        System.out.println("monkey is biting...");
    }
}
class human extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    public void talk(){
        System.out.println("Talking...");
    }
}
