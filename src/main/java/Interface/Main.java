package Interface;

import Logic.Battlefield.BattleField;
import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;
import Logic.Entities.Character.Class.*;
import Logic.Entities.Character.*;
import Logic.Entities.*;
import Logic.Entities.Skill.*;

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

        BattleField arena = new BattleField(assassin1,assassin2);
        int firstWinner=0;
        int secondWinner=0;
        int battleCount = 100;

        for (int i =0; i<battleCount; i++) {
            Warrior winner = arena.stardBattle();
            if (winner == assassin1) firstWinner++;
            else secondWinner++;
        }
        System.out.println("Колличество боев: "+battleCount);
        System.out.println("Победил "+assassin1+": "+firstWinner);
        System.out.println("Победил "+assassin2+": "+secondWinner);
    }
}
