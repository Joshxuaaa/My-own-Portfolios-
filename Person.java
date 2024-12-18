public class Person{

    private String Vorname;
    private String Nachname;
    private String Geburtsdatum;
    private String Straße;
    private int Hausnummer;
    private int Postleitzahl;
    private String Stadt;

    public Person(String Vorname, String Nachname, String Geburtsdatum, String Straße, int Hausnummer, int Postleitzahl, String Stadt){

        this.Vorname= Vorname;
        this.Nachname= Nachname;
        this.Geburtsdatum= Geburtsdatum;
        this.Straße= Straße;
        this.Hausnummer= Hausnummer;
        this.Postleitzahl= Postleitzahl;
        this.Stadt= Stadt;
    }

    public String getVorname(){
        return Vorname;
    }

    public void setVorname(String Vorname){
        this.Vorname= Vorname;
    }

    public String getNachname(){
        return Nachname;
    }

    public void setNachname(String Nachname){
        this.Nachname= Nachname;
    }

    public String getGeburtsdatum(){
        return Geburtsdatum;
    }

    public void setGeburtsdatum(String Geburtsdatum){
        this.Geburtsdatum= Geburtsdatum;
    }

    public String getStraße(){
        return Straße;
    }

    public void setStraße(String Straße){
        this.Straße= Straße;
    }

    public int getHausnummer(){
        return Hausnummer;
    }

    public void setHausnummer(int Hausnummer){
        this.Hausnummer= Hausnummer;
    }

    public int getPostleitzahl(){
        return Postleitzahl;
    }

    public void setPosteleitzahl(int Postleitzahl){
        this.Postleitzahl= Postleitzahl;
    }

    public String getStadt(){
        return Stadt;
    }

    public void setStadt(String Stadt){
        this.Stadt= Stadt;
    }

@Override
    public String toString(){
        return "Der Name des Persons lautet: "+getVorname()+  ", der Nachname es Persons lautet:  "+getNachname()+ ", der Geburtsdatum lautet: "+getGeburtsdatum()+ ", Die Straße Lautet: " +getStraße()+ +getHausnummer()+", die Postlitzahl bzw. Stadt lautet: "  +getPostleitzahl()+ " " +getStadt();
    }
}

