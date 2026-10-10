import java.util.Scanner;

public class Persontest{
    public static void main(String [] args){

        int Kinderanzahl=0;

        //boolean wahr=true;

        Scanner Sc= new Scanner(System.in);

        System.out.println("Bitte geben Sie ihren Vornamen ein: ");
        String Vorname= Sc.next();

        System.out.println("Bitte geben Sie ihren Nachnamen ein: ");
        String Nachname= Sc.next();

        System.out.println("Bitte geben Sie ihren Geburtsdatum ein: ");
        String Geburtsdatum= Sc.next();

        System.out.println("Geben Sie ihre Straße ein: ");
        String Straße= Sc.next();

        System.out.println("Geben Sie ihre Hausnummer ein: ");
        int Hausnummer= Sc.nextInt();

        System.out.println("Geben Sie ihr Postleitzahl ein: ");
        int Postleitzahl= Sc.nextInt();

        System.out.println("Geben Sie ihr Stadtteil ein: ");
        String Stadtteil= Sc.next();


        System.out.println("Haben Sie Kinder? ");
        String Kinder= Sc.next();

        if(Kinder.equals("Ja")){
            System.out.println("Wie viele Kinder besitzen Sie? ");
            Kinderanzahl = Sc.nextInt();
        }

        System.out.println("Sind Sie verheiratet?");
        String Verheiratet= Sc.next();

        if(Verheiratet.equals("Ja")){
            System.out.println("Er oder Sie ist Verheiratet");
        }else{
            System.out.println("Er oder Sie ist noch nicht verheiratet");
        }

        System.out.println("Sind Sie ein Student?");
        String Student= Sc.next();

        if(Student.equals("Ja")){
            System.out.println("Er oder Sie ist ein Student");
        }else{
            System.out.println("Er oder Sie ist kein Student");
        }



        Sc.close();

        Person person= new Person(Vorname, Nachname, Geburtsdatum, Straße, Hausnummer, Postleitzahl, Stadtteil);
        Erwachsener erwachsener= new Erwachsener(Vorname, Nachname, Geburtsdatum, Straße, Hausnummer, Postleitzahl, Stadtteil, Kinder, Kinderanzahl, Student, Verheiratet);
        

        person.toString();


        System.out.println(person);
        System.out.println(erwachsener);

       // if"==wahr"
    }
}



//public Sch�ler(String name, String anschrift, String geburtsdatum, String elternhaus, boolean verheiratet, String schule, String klasse){

//super(name,anschrift, geburtsdatum, elternhaus, verheiratet);
