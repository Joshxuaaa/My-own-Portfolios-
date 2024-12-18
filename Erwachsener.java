class Erwachsener extends Person{
    String Kinder;
    int Kinderanzahl;
    String Student;
    String Verheiratet;

    public Erwachsener(String Vorname, String Nachname, String Geburtsdatum, String Straße, int Hausnummer, int Postleitzahl, String Stadt, String Kinder, int Kinderanzahl, String Student, String Verheiratet){
        super(Vorname, Nachname, Geburtsdatum, Straße, Hausnummer, Postleitzahl, Stadt);

        this.Kinder= Kinder;
        this.Kinderanzahl= Kinderanzahl;
        this.Student= Student;
        this.Verheiratet= Verheiratet;
    }

    public String istKinder(){
        return Kinder;
    }

    public void setKinder(String Kinder){
        this.Kinder= Kinder;
    }

    public int getKinderanzahl(){
        return Kinderanzahl;
    }

    public void setKinderanzahl(int Kinderanzahl){
        this.Kinderanzahl= Kinderanzahl;
    }

    public String istStudent(){
        return Student;
    }

    public void setStudent(String Student){
        this.Student= Student;
    }

    public String istVerheieratet(){
        return Verheiratet;
    }

    public void setVerheiratet(String Verheiratet ){
        this.Verheiratet= Verheiratet;
    }

@Override
     public String toString(){
        return "Sind Sie ein Student? " +istStudent()+ ", Die Person hat: " +getKinderanzahl()+  " Kinder. ,Sind Sie bereits schon verheiratet? " +istVerheieratet();
    }
}

