//Underklasse af Leader, og klasse implementere metoderne fra PowerActions
public class Politicaldictator extends Leader implements PowerActions {

    //attribut kun for Politicaldictator
      private String partyName;

    //kontruktør som arver fra Leader + partyName.
      public Politicaldictator(String name, String country, int yearsInPower, String partyName){
          super(name,country,yearsInPower);
          this.partyName=partyName;
}

//Overridding af metoder
    @Override
    public String giveSpeech() {
        return name + " is friends with putin";
    }

    @Override
    public String implementPolicy(String policy) {
        return name + " is the only man in charge, policy: "+policy;
    }

    @Override
    public String repressOpposition() {
        return name + " is killing everyone who doesn't like him";
    }

    @Override
    public String holdParade() {
        return "A parade is held in honor of " + name + "!";
    }
    //metode med supermetode der arver fra Leader
    @Override
    public void printDetails(){
        super.printDetails();
            System.out.println(name+"'s party name is "+partyName);
        }

}


