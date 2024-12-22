import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Quiztimer{
    public static void main(String [] args){

        Scanner Sc= new Scanner(System.in);

        Timer timer= new Timer();
        TimerTask task= new TimerTask(){



        @Override
        public void run(){
            System.out.println("Nicht erfolgreich!!");
        }
    };

    timer.schedule(task, 10000);


    System.out.println("Wo habe ich mein erstes Urlaub gemacht: A) Paris, B) München, C) Madrid, D)Liege");
    String antwort= Sc.next();

    if(antwort.equals("Paris")){
        System.out.println("Die Antwort ist richtig!");
    }else{
        System.out.println();
    }
    Sc.close();
}
}
//


