package Abstract_question;
public class question2 {
    public static void main(String[] args) {
        human h = new human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
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
}
