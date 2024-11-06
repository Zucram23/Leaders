//Arraylist til vores objekter
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // vores objekter
        Militarydictator putin = new Militarydictator("Putin", "Russia", 20, "president");
        Politicaldictator kim = new Politicaldictator("Kim-Jung-Un", "North Korea", 13, "Kim-Funk-Un");

        //arraylist
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add(kim);
        leaders.add(putin);

        //for-løkke til at printe alle oplysningerne
        for (Leader leader : leaders) {
            leader.printDetails();

        //if statement til hvis vores ledere har implementerede metoderne fra PowerAction, så printer vi dem ud.
        if (leader instanceof PowerActions) {
            PowerActions actions = (PowerActions) leader;
            System.out.println(actions.implementPolicy("no rights for black people"));
            System.out.println(actions.holdParade());
            System.out.println(actions.repressOpposition());
            System.out.println(leader.giveSpeech()+"\n");

        }
    }
    }
}
