public class passwortgen{
    private final String passwortbuchstaben;
    private final String passwortnumbers;
    private final String passwortsymbole;

    public passwortgen(){
        passwortbuchstaben="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        passwortnumbers="1234567890";
        passwortsymbole="@€|µ+#*§$%&?!^";
    }


    public passwortgen(String passwortbuchstaben, String passwortnumbers, String passwortsymbole){
        this.passwortbuchstaben= passwortbuchstaben;
        this.passwortnumbers= passwortnumbers;
        this.passwortsymbole= passwortsymbole;
    }

    public String getPasswortbuchstaben(){
        return passwortbuchstaben;
    }

    public String getPasswortnumbers(){
        return passwortnumbers;
    }

    public String passwortsymbole(){
        return passwortsymbole;
    }


    public String randompasswort(){

        char randomaufnahme;
        char randomaufnahme1;
        char randomaufnahme2;
        String erg="";

        for(int i=0; i<10; i++){
            randomaufnahme= passwortbuchstaben.charAt((char) (Math.random()*6));
            randomaufnahme1= passwortnumbers.charAt((char) (Math.random()*6));
            randomaufnahme2= passwortsymbole.charAt((char) (Math.random()*6));
            erg += randomaufnahme;
            erg += randomaufnahme1;
            erg += randomaufnahme2;
        }
       return erg;
    }
    
    @Override
    public String toString(){
        return "Das Passwort lautet: " +getPasswortbuchstaben();
    }

        public static void main(String [] args){

            passwortgen passwortgenerator= new passwortgen();

            System.out.println(passwortgenerator.randompasswort());
        }
    }
