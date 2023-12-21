class employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is = "+id);
        System.out.println("my name is = "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class ep1 {
    public static void main(String[] args) {
        System.out.println("After creating object = ");


        employee emp = new employee();
        emp.id = 220904;
        emp.name = "its_a_secret.";
        //System.out.println(emp.id);
        //System.out.println(emp.name);
        emp.salary = 19; 
        emp.printDetails();


        employee emp2 = new employee();
        emp2.id = 2004;
        emp2.salary = 12;
        emp2.name = "me nhi btaunga";
        emp2.printDetails();
        int salary = emp2.getSalary();
        System.out.println(salary);
    }
}
