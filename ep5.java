class myemployee{
    int id;
    String name;


    public myemployee(String naam, int ID){
        id = ID;
        name = naam;
    }
    // public myemployee(){
    //     id = 69;
    //     name = "Sam";
    // }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        name = n;
    } 
    public String getname(){
        return name;
    }
}
public class ep5 {
    public static void main(String[] args) {
        myemployee me = new myemployee("Sabka PaPa",90);
        //me.setid(50);
        System.out.println(me.getid());
        //me.setname("Sujal BaBa");
        System.out.println(me.getname());
    }
}
