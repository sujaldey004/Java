import java.util.Scanner;
import java.util.Random;

class Game{
    public int n;
    public int ui;
    private int guess;
    public int think;

    public void setGuess(int guess){
        this.guess = guess;
    }
    public int getGuess(){
        return guess;
    }
    Game(){
        Random rand = new Random();
        n = rand.nextInt(100);
    }
    void takeinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (Between 1 to 100)= ");
        ui = sc.nextInt();
    }
    boolean check(){
        think++;
        if(ui == n){
            System.out.println("You guess it right, it was "+n+".\nYou guess it in "+think+" attempts.");
            return true;
        }
        else if(ui < n){
            System.out.println("Too low...");
        }
        else if(ui > n){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class ep6_game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
        g.takeinput();
        b = g.check();
        if(b == true){
            break;
        }
        else{
            System.out.println("Try Again :)");
        }
        }
    }
}
