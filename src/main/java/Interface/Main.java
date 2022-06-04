package Interface;

import Logic.Battlefield.BattleField;
import Logic.Battlefield.WarriorTask;
import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;
import Logic.Entities.Character.Class.*;
import Logic.Entities.Character.*;
import Logic.Entities.*;
import Logic.Entities.Skill.*;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Traider traider = new Traider();

        IWeapon sword1 = traider.getWeapon(WeaponType.SWORD);
        IWeapon knife1 = traider.getWeapon(WeaponType.KNIFE);

        IArmor liteArmor = traider.getArmor(ArmorType.LITEARMOR);
        IArmor mediumArmor = traider.getArmor(ArmorType.MEDIUMARMOR);

        Recruit recruit1 = new Recruit();
        Recruit recruit2 = new Recruit();

        Assassin assassin1 = new Assassin("Мужик слева",knife1,liteArmor,recruit2,new BackStab());
        Assassin assassin2 = new Assassin("Мужик справа",knife1,liteArmor,recruit1,new BackStab());
        //Assassin assassin2 = new Assassin("Мужик справа",sword1,mediumArmor,recruit1,new Inviz());

        WarriorTask warrior1 = new WarriorTask(assassin1,assassin2);
        WarriorTask warrior2 = new WarriorTask(assassin2,assassin1);

        Timer timer = new Timer();
        timer.schedule(warrior1, 0,10);
        timer.schedule(warrior2,0,10);

        do{

        }while (assassin1.isAlive() && assassin2.isAlive());
        System.out.println("конец");
    }
}
