package inheritance_question;

class Que1{
    public static void main(String[] args) {
        cylinder cl = new cylinder(4,20);
        System.out.println("area of circle is = "+cl.circle_area());
        System.out.println("circumference of circle is = "+cl.circle_circumferene());
        System.out.println("area of cylinder is = "+cl.cylinder_area());
        System.out.println("volume of cylinder is = "+cl.cylinder_volume());
    }
}

class circle{
    public int radius;
    public int height;
    circle(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public double circle_area(){
        return Math.PI*this.radius*this.radius;
    }
    public double circle_circumferene(){
        return 2*Math.PI*this.radius;
    }
}

class cylinder extends circle{
    cylinder(int radius, int height){
        super(radius, height);
    }
    public double cylinder_volume(){
        return Math.PI*radius*radius*height;
    }
    public double cylinder_area(){
        return Math.PI*2*this.radius*this.height + 2*Math.PI*this.radius*this.radius;
    }
}
