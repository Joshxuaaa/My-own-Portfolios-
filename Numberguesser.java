import java.util.Random;
import java.util.Scanner;

public class Numberguesser{
    public static void main(String [] args){

        Scanner Sc= new Scanner(System.in);
        Random random= new Random();
        
        System.out.println("Geben Sie für n eine Zahl zwischen 1 bis 100 ein: ");
        int guess= Sc.nextInt();

        int randomnumbers= (int) random.nextInt(100)+1;

        System.out.println(randomnumbers);

        if(randomnumbers>guess){
            System.out.println("too low");
        }else if(randomnumbers>=guess|| randomnumbers<=guess){
                    System.out.println("Is correct!");
                }else if(randomnumbers<guess){
                    System.out.println("too high");
                }
                Sc.close();
            }
        }
       