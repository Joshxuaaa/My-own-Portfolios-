import java.util.Scanner;

class Login{
    
    private String nutzername;
    private String passwort;


public Login(String nutzername, String passwort){

    this.nutzername= nutzername;
    this.passwort= passwort;
}

public String getNutzername(){
    return nutzername;
}

public String setNutzername(String newNutzername){
    this.nutzername= newNutzername;
    return nutzername;
}

public String getPasswort(){
    return passwort;
}

public String setPasswort(String newPasswort){
    this.passwort= newPasswort;
    return passwort;
}

public String toString(){
    return "Der Nutzername des Users lautet: " +this.nutzername+ ", Das Passwort ist: " +this.passwort;
}


public static void main(String [] args){

    Scanner Sc= new Scanner(System.in);

    System.out.println("Bitte geben Sie ihren Nutzernamen ein: ");
    String nutzername= Sc.next();

    System.out.println("Bitte geben Sie ihren Passwort ein: ");
    String passwort= Sc.next();

    Sc.close();

    Login login= new Login(nutzername, passwort);

    login.getNutzername();
    login.getPasswort();
    login.toString();

    System.out.println(login);
}
}











