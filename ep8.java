/*class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("I am On");
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
public class ep8 {
    public static void main(String[] args) {
        derived d = new derived();
        d.setX(69);
        System.out.println("The value is = "+d.getX());
        d.setY(96);
        System.out.println("The  value is "+d.getY());
    }
}
*/




class Animal {
    int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
class dog extends Animal{
    int eyes;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public void Bark(){
        System.out.println("Dogs always bark!");
    }
}
class ep8{
    public static void main(String[] args) {
        dog d = new dog();
        d.setLegs(4);
        System.out.format("Dogs have %d legs\n",d.getLegs());
        d.setEyes(2);
        System.out.format("Dogs have %d eyes\n",d.getEyes());
        d.Bark();
    }
}