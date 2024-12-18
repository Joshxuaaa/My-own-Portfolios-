import java.util.Scanner;

import java.util.Random; 

public class passwortgenerator{

    private String passwort;

    public passwortgenerator(){
        passwort= "";
    }

    public passwortgenerator(String passwort){
        this.passwort= passwort;
    }

    public String getPasswort(){
        return passwort;
    }

    public void setPasswort(String passwort){
        this.passwort= passwort;
    }

    public String randompassworter(){

        String randompasswort="";

        char [] Buchstaben= passwort.toCharArray();

        for(int i=0; i<Buchstaben.length; i++){
            Random random= new Random();
            randompasswort= (String) random.Buchstaben()*6;
        }
        return String randompasswort.toString();
    }

    public static void main(String [] args){

        Scanner Sc = new Scanner(System.in);


       try{
        System.out.println("Pls type some password: ");
        String passwort= Sc.next();

        passwortgenerator passwortgen= new passwortgenerator(passwort);

        passwortgen.randompassworter();

        System.out.println(passwortgen);
       }finally{
        System.out.println("The passwort print out was sucessfull");
       }
    }
}

  



