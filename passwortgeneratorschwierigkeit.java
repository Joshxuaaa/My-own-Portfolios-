import java.util.Scanner;
import java.util.Random; 

public class passwortgeneratorschwierigkeit{

    private String passwort;

    public passwortgenerator(String passwort){
        this.passwort= passwort;
    }

    public String getPasswort(){
        return passwort;
    }

    public String setPasswort(String passwort){
        return this.passwort= passwort;
    }
    
    private static String randompassworter(String eingabe){

        Random random= new Random();


        if(eingabe.equals("light")){
            random.

            
        }else if(eingabe.equals("middle")){

        }else if(eingabe.equals("hard")){

        }


    }




    public static void main(String [] args){

        Scanner Sc= new Scanner(System.in);
        
        System.out.println("Bitte wählen Sie sich eine Passwort Stärke aus(Choose a password strength): light, middle or hard ");
        String eingabe= Sc.next();

        passwortgenerator passwortgen= new passwortgenerator(eingabe);

        passwortgen.randompassworter(eingabe);


    }


