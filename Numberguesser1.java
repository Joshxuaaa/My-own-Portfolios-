import java.util.Random;
import java.util.Scanner;

public class Numberguesser1{
    public static void main(String [] args){

        Scanner Sc= new Scanner(System.in);
        Random random= new Random();
        
        
        int attempts=0;
        Boolean gameRunning=true;
        
        int randomnumbers= (int) random.nextInt(100)+1;
        
        System.out.println("Willkomen zum Spiel!");
        System.out.println("Geben Sie für n eine Zahl zwischen 1 bis 100 ein: ");
        
        while(gameRunning){
            System.out.print("Enter your guess (or type 'quit' to exit): ");
            String input= Sc.nextLine();
            
            if(input.equalsIgnoreCase("quit")){
                System.out.println("Du hast dich dazu entschieden das Spiel zu verlassen. Die zufällige Nummer war: "+randomnumbers);
                gameRunning = false;
                break;
            }
            try{
                int guess = Integer.parseInt(input);
                attempts++;
            
        
        
                if(randomnumbers<guess){
                    System.out.println("too low");
                }else if(guess>randomnumbers){
                    System.out.println("Too High!");
                }else{
                    System.out.println("Gluckwünsch! Es kam die Nummer: " +randomnumbers);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        Sc.close();
    }
}
    
       