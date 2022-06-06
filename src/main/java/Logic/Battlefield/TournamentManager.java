package Logic.Battlefield;

import Logic.Entities.Character.Warrior;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class TournamentManager {
    private int numberOfParticipants;
    private Warrior warrior;
    WarriorTask warriorTask;
    Random random;
    protected Map <Integer, Warrior> listOfFighters;

    public TournamentManager(Map listOfFighters, int numberOfParticipants,WarriorTask warriorTask){
        this.listOfFighters = new HashMap<>();
        random = new Random();
        this.numberOfParticipants = numberOfParticipants;
        this.warriorTask = warriorTask;

    }

    private Map registrationOfFighters(Map listOfFighters, Warrior warrior, int numberOfParticipants){
        for (int i = 0; i < numberOfParticipants; i++){
            listOfFighters.put(i, warrior);
        }
            return listOfFighters;
    }

}
