import java.util.Scanner;

public class Solutionpalindromenum{

    public static boolean istpalindrome(int x){


        if(x<0){
            System.out.println("Die Zahl muss größer als Null sein!");
            return false;
        }

        int n=x;
        int rev=0;

        while(n>0){

            int d=n%10; // Ist andersrum z.B bei 256 wäre es 652, oder bei 121 wäre es 121.
            rev= rev*10+d;
            n=n/10;
        }

            if(rev==x){
                return true;
            }
            return false;
        }
        
        
        

        public static void main(String [] args){

            Scanner Sc= new Scanner(System.in);

            System.out.println("Geben Sie eine ganze Zahl ein: (Am besten dreistellig!)");
            int zahl= Sc.nextInt();



            boolean result= istpalindrome(zahl);

            System.out.println(result);

            Sc.close();
        }
    }
        





        
            

