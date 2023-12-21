package inheritance_question;
public class que2 {
    public static void main(String[] args) {
        cuboid c = new cuboid();
        c.setL(10);
        c.setB(6);
        c.rectangle_area();
        c.rectangle_perimeter();
        c.setH(5);
        c.cuboid_area();
        c.cuboid_volume();
    }
}
class rectangle{
    int l,b;
    
    public void setL(int length) {
        this.l = length;
    }
    public void setB(int breadth) {
        this.b = breadth;
    }
    public void rectangle_area(){
        System.out.println("the area of rectangle is = "+this.l*this.b);
    }
    public void rectangle_perimeter(){
        System.out.println("the perimeter of rectangle is = "+2*(this.l+this.b));
    }
}
class cuboid extends rectangle{
    int h;
    public void setH(int height) {
        this.h = height;
    }
    public void cuboid_area(){
        System.out.println("the area of cuboid is = "+2*(this.l*this.b+this.b*this.h+this.l*this.h));
    }
    public void cuboid_volume(){
        System.out.println("the volume of cuboid is = "+this.l*this.b*this.h);
    }

}