// /*que1*/
// class Employee {
//     int salary;
//     String name;

//     public int getSalary() {
//         return salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String n) {
//         name = n;
//     }
// }

// public class ep2 {
//     public static void main(String[] args) {
//         Employee sam = new Employee();
//         sam.setName("Sujal");
//         System.out.println(sam.getName());
//         sam.salary = 100000000;
//         System.out.println(sam.getSalary());
//     }
// }






// /*que2*/
// class cellphone{
//     public void ring(){
//         System.out.println("Ringing....");
//     }
//     public void vibrate(){
//         System.out.println("Vibrating....");
//     }
//     public void callFriend(){
//         System.out.println("Calling Riya....");
//     }
// }
// class ep2{
//     public static void main(String[] args) {
//     cellphone samsung = new cellphone();
//     samsung.ring();
//     samsung.vibrate();
//     samsung.callFriend();
//     }
// }




// /*que3*/
// class square{
//     int side;
//     public void area(int side) {
//         System.out.println("Area of square is: " + side * side);
//     }
//     public void perimeter(int side) {
//         System.out.println("Perimeter of square is: " + 4 * side);
//     }
// }
// class ep2{
//     public static void main(String[] args) {
//     square s = new square();
//     s.side = 3;
//     s.area(s.side);
//     s.perimeter(s.side);
//     }
// }

/*que4*/
// class rectangle{
//     int length;
//     int breadth;
//     public void perimeter(int length, int breadth){
//         System.out.println("The permieter of rectangle is = "+(length+breadth)*2);
//     }
//     public void area(int length, int breadth){
//         System.out.println("The area of ractangle is = "+length*breadth);
//     }
// }
// class ep2{
//     public static void main(String[] args) {
//         rectangle r = new rectangle();
//         r.length = 5;
//         r.breadth = 4;
//         r.perimeter(r.length,r.breadth);
//         r.area(r.length,r.breadth);
//     }
// }





/*que5*/
// class tommy{
//     public void hit(){
//         System.out.println("Hitting the enemy");
//     }
//     public void run(){
//         System.out.println("Running from the enemy");
//     }
//     public void fire(){
//         System.out.println("Firing on the enemy");
//     }
// }
// class ep2{
//     public static void main(String[] args) {
//         tommy game = new tommy();
//         game.hit();
//         game.fire();
//         game.run();
//     }
// }





class circle{
    int radius;
    public void circumference(){
        System.out.println("The circumference of circle is = "+2*3.14*radius);
    }
    public void area(){
        System.out.println("The area of circle is = "+3.14*radius*radius);
    }
}
class ep2{
    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 506;
        c.circumference();
        c.area();
    }
}