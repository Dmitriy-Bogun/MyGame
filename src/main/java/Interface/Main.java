package Interface;

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
        Recruit recruit1 = new Recruit();
        //System.out.println(recruit1.attack());
        //Paladin paladin = new Paladin(sword1,recruit1);
        //System.out.println(paladin.attack());

        System.out.println("=========================");

        IWeapon knife1 = traider.getWeapon(WeaponType.KNIFE);
        IArmor liteArmor = traider.getArmor(ArmorType.LITEARMOR);
        Recruit recruit2 = new Recruit();
        IArmor mediumArmor = traider.getArmor(ArmorType.MEDIUMARMOR);
        Assassin assasin1 = new Assassin(knife1,liteArmor,recruit2,new BackStab());
        //System.out.println(assasin1.attack());
        //assasin1.useSkill();
        //Assassin assasin2 = new Assassin(sword1,mediumArmor,recruit1,new Inviz());
        //assasin2.useSkill();
        System.out.println(assasin1.dexterity());


    }
}
