class MyEmployee {
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
class ep3{
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
        e1.setName("Sujal");
        System.out.println(e1.getname());
        e1.setId(69);
        System.out.println(e1.getId());
    }
}