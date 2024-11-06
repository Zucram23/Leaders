//Abstrakt leder klasse
public abstract class Leader {
    protected String name;
    protected String country;
    protected int yearsInPower;

    //kontruktør til at initialisere objekt
    public Leader(String name, String country, int yearsInPower){
    this.name=name;
    this.country=country;
    this.yearsInPower=yearsInPower;
    }

    //Abstrakt metode til at holde en tale
    public abstract String giveSpeech();

    //Konkret metode til at udskrive detajler
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower);
    }

}
