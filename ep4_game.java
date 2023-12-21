import java.util.*;
import java.util.Random.*;

public class ep4_game {
    public static void main(String[] args) {
        System.out.print("Enter 0 for rock,1 for paper and 2 for Scissor = ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        Random rd = new Random();
        int u = rd.nextInt(3);

        if(i == u){
            System.out.println("Draw!");
            System.out.println("Computer choice = "+u);
        }
        else if(i == 0 && u == 2 || i == 1 && u == 0 || i == 2 && u == 1){
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer wins!");
        }
        if(u == 0){
            System.out.println("Computer choice = Rock");
        }
        else if(u == 1){
            System.out.println("Computer choice = Paper");
        }
        else if(u == 0){
            System.out.println("Computer choice = Scissor");
        }
    }
}
