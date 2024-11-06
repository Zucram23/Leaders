//Underklasse af Leader, og klasse implementere metoderne fra PowerActions
public class Militarydictator extends Leader implements PowerActions{

    //attribut kun for Militarydictator
    private String militaryRank;

//kontruktør som arver fra Leader + militaryRank.
    public Militarydictator(String name, String country, int yearsInPower, String militaryRank){
        super(name,country,yearsInPower);
        this.militaryRank=militaryRank;
}

// metode som overrider
    @Override
    public String giveSpeech(){
           return name + " is speeking about bombing Ukraine";
    }

    //metode som overrider
    @Override
    public String implementPolicy(String policy){
      return name + " is implementing very racist policies such as: "+policy;
    }
    //metode som overrider
    @Override
    public String repressOpposition(){
    return name + " is putting everyone in jail who is against him";
    }

    //metode som overrider
    @Override
    public String holdParade(){
    return "Militarydictator " + name + " is holding a war parade";
    }

    //metode med supermetode der arver fra Leader
    @Override
    public void printDetails(){
    super.printDetails();
        System.out.println(name+"'s military rank is: "+militaryRank);
    }
}
