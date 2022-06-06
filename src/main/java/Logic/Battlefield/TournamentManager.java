package Logic.Battlefield;

import Logic.Entities.Character.Warrior;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class TournamentManager {
    private int numberOfParticipants;
    private Warrior warrior;
    Random random;
    private Map <Integer, Warrior> listOfFighters;

    public TournamentManager(Map listOfFighters, int numberOfParticipants){
        this.listOfFighters = new HashMap<>();
        random = new Random();
        this.numberOfParticipants = getNumberOfParticipants();

    }

    private Map registrationOfFighters(Map listOfFighters, Warrior warrior, int numberOfParticipants){
        for (int i = 0; i < numberOfParticipants; i++){
            listOfFighters.put(i, warrior);
        }
            return listOfFighters;
    }

    public int getNumberOfParticipants() {
        this.numberOfParticipants = random.nextInt(16 + 1);
        if(numberOfParticipants % 2 != 0 ) numberOfParticipants = numberOfParticipants +1;
        return numberOfParticipants;
    }
}
