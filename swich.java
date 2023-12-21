import java.util.*;
public class swich {
    public static void main(String[] args){
        System.out.println("Enter only m,t,w,T,f,s,S");
        System.out.print("Enter the day = ");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch(day){
            case "m" : 
            System.out.println("its monday ");
            break;
            case "t" :
            System.out.println("its tuesday");
            break;
            case "w" :
            System.out.println("its Wednesday");
            break;
            case "T" :
            System.out.println("its Trursday");
            break;
            case "f" :
            System.out.println("its friday");
            break;
            case "s" : 
            System.out.println("its saturday");
            break;
            case "S" :
            System.out.println("its Sunday");
            break;
        }
    }
}
