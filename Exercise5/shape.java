package Exercise5;

public class shape {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setLength(5);
        r.setBreadth(6);
        r.area();
        square s = new square();
        s.setSide(4);
        s.area();
        sphere c = new sphere();
        c.setRadius(9);
        c.setHeight(12);
        c.area();
        c.cylinderVolume();
        c.sphereVolume();
    }
}
class rectangle{
    private int length;
    private int breadth;
    public void setLength(int Length) {
        this.length = Length;
    }
    public void setBreadth(int Breadth) {
        this.breadth = Breadth;
    }
    public void area(){
        System.out.println("Area of rectangle is = "+this.length*this.breadth);
    }
}
class square{
    int side;
    public void setSide(int side){
        this.side = side;
    }
    public void area(){
        System.out.println("Area of square is = "+this.side*this.side);
    }
}
class circle{
    int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area of circle is = "+Math.PI*this.radius*this.radius);
    }
}
class cylinder extends circle{
    int height;
    public void setHeight(int height){
        this.height = height;
    }
    public void cylinderVolume(){
        System.out.println("Volume of cylinder is = "+Math.PI*this.radius*this.radius*this.height);
    }
}
class sphere extends cylinder{
    public void sphereVolume(){
        System.out.println("Volume of sphere is = "+ 4/3*Math.PI*this.radius*this.radius*this.radius);
    }
}