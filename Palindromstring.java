import java.util.Scanner;

public class Palindromstring{


    public static boolean istpal(String Text){



        String text = Text.toLowerCase();

        for(int i=0; i<text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){

        Scanner Sc= new Scanner(System.in);


        System.out.println("Bitte geben Sie für den ersten Text was ein:");
        String text1= Sc.next();
        System.out.println("Bitte geben Sie für den zweiten Text was ein:");
        String text2= Sc.next();


        if(istpal(text1)){
            System.out.println("Text 1 ist ein Palindrome!!");
        }if(istpal(text2)){
            System.out.println("Text 2 ist ein Palindrome!!");
        }else{
            System.out.println("Ist kein Palindrome!!");
        }
        Sc.close();
    }
}

    

