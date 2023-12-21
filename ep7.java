class cylinder{
    private float radius;
    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    private float height;


    public void setradius(float radius){
        this.radius = radius;
    }
    public float getradius(){
        return radius;
    }
    public void setheight(float height){
        this.height = height;
    }
    public float getheight(){
        return height;
    }
    public double surfacearea(){
        return 2*3.14159*radius*height + 2*3.14159*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class rectangle{
    public int length,breadth;

    // public int getLength() {
    //     return length;
    // }

    // public int getBreadth() {
    //     return breadth;
    // }

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class sphere{
    private int r;

    public int getr() {
        return r;
    }

    public void setr(int r) {
        this.r = r;
    }
    public double area(){
        return 4*Math.PI*r*r;
    }
    public double volume(){
        return 1.3333*Math.PI*r*r*r;
    }
}

public class ep7 {
    public static void main(String[] args) {
        cylinder c = new cylinder(9,12);

        //c.setradius(9f);
        //c.setheight(12f);
        //System.out.println("The radius is = "+c.getradius());
        //System.out.println("The height is = "+c.getheight());
        System.out.println("The area of cylinder is = "+c.surfacearea());
        System.out.println("The volume of cylinder is = "+c.volume());
        rectangle r = new rectangle(8,7);
        System.out.println("length = "+r.length);
        System.out.println("breadth ="+r.breadth);
        //rectangle r = new rectangle();
        //System.out.println("length = "+r.getLength());
        //System.out.println("breadth = "+r.getBreadth());
        sphere s = new sphere();
        s.setr(5);
        System.out.println("The radius of sphere is = "+s.getr());
        System.out.println("The area of sphere is = "+s.area());
        System.out.println("The volume of sphere is = "+s.volume());
    }
}
