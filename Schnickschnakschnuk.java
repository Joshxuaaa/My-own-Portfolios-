import java.util.Random;
import java.util.Scanner;

public class Schnickschnakschnuk{
    
    
    public String userwahl(){

       
        Scanner Sc= new Scanner(System.in);
        
        System.out.println("Wähle: Stein, Schere, Papier!");
        String User= Sc.next();
        
        if(User.equals("stein") ||User.equals("Stein")){
            return "Stein";
        }else if(User.equals("Papier") || User.equals("papier")){
            return "Papier";
        }else if(User.equals("schere") || User.equals("Schere")){
            return "Schere";
        }else{
            System.out.println("Ungültig! Bitte versuchen es Sie erneut");
            return userwahl();
        }
    }

    
    public String computerwahl() {
        Random random= new Random();
        String[] wahl = {"Stein", "Papier", "Schere"};
        int index = random.nextInt(wahl.length);
        return wahl[index];
    }

    public static String gewinner(String User, String Computer){
        if(User.equals(Computer)){
            return "unentschieden!";
        }else if(User.equals("stein")&&Computer.equals("schere") ||
        (User.equals("papier")&&Computer.equals("stein")) ||
        (User.equals("schere")&&Computer.equals("papier"))){
            return "nutzer";
        }else{
            return "computer";
        }
    }


    public static void main(String[] args) {

        Schnickschnakschnuk schnik = new Schnickschnakschnuk();

        Scanner Sc= new Scanner(System.in);

        System.out.println("Willkommen beim Spiel: Schere, Stein, Papier!");

        System.out.println("Wie viele Runden möchten Sie spielen?");
        int rundenanzahl= Sc.nextInt();

        int userpunkte= 0;
        int computerpunkte= 0;


        for(int runde=1; runde<rundenanzahl; runde++){
            System.out.println("Es ist die Runde:" +runde);
            String userwahl = schnik.userwahl();
            String computerwahl = schnik.computerwahl();
            System.out.println("Der Nutzer hat: " +userwahl+ " gewählt.");
            System.out.println("Der Computer hat: " +computerwahl+ " gewählt.");
        String sieger= gewinner(userwahl, computerwahl);
        if(sieger.equals("nutzer")){
            System.out.println("Du hast die Runde gewonnen!");
            userpunkte +=1;
        }else if(sieger.equals("computer")){
            System.out.println("Computer hat die Runde gewonnen!");
            computerpunkte +=1;
        }else{
            System.out.println("Die Runde ist ein unentschieden!");
        }
        System.out.println("Punktestand: Du "+userpunkte+ " - "+computerpunkte+ "Computer.");
    }

        System.out.println("Endergebnis:  ");
        if (userpunkte>computerpunkte){
            System.out.println("Du hast dir den SIeg geholt!");
        }else if(userpunkte<computerpunkte){
            System.out.println("Leider hat der CPU das Spiel gewonnen!");
        }else{
            System.out.println("Leider ein Unentschieden zwischen beide Parteien!");
        }
    }
}

