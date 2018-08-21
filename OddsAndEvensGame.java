
import java.util.*;
public class OddsAndEvens {
    public static void main(String [] args) {
        
        System.out.println("Lets play a game called Odds And Evens");
        Scanner input = new Scanner(System.in);
        System.out.print("Whats your name?");
        String name = input.nextLine();
        System.out.print("Hi! "+name+", which do you choose? (O)dds or (E)vens?");
        String selection = input.next();
        
        //to check whether user opt odd or even
        if(selection.equalsIgnoreCase("O"))
            System.out.println(name+" has picked odds! The computer will be evens.");
        else
            System.out.println(name+" has picked evens! The computer will be odds.");
        
        System.out.println("-------------------------------");
        
        // taking the input of fingers and generating computer's selection
        System.out.print("How many (fingers) do you put out?");
        int finger = input.nextInt();
        Random number = new Random();
        int computerfinger = number.nextInt(5);
        System.out.println("Computer plays "+computerfinger+"(fingers)");
        System.out.println("---------------------------------");
        
        int sum = finger + computerfinger;
        System.out.println(finger +" + " +computerfinger+" = "  +sum);
        
        // to decide number is either odd or even and declare the result
        if(sum%2 == 0) {
            System.out.println(sum+" is even.....!");
            if(selection.equals("o"))
                System.out.println("Computer wins....!");
            else
                System.out.println(name+" wins.........!");
            
        }
        else {
            System.out.println(sum+" is odd......!");
            if(selection.equals("o"))
                System.out.println(name+" wins.....!");
            else
                System.out.println("Computer wins.......!");
        }
        
        System.out.println("-----------------------------------");
        
    }
}
