package Interface;

import Logic.Entities.IArmor;
import Logic.Entities.IWeapon;
import Logic.Entities.Impl.*;

public class Main {
    public static void main(String[] args) {

        Traider traider = new Traider();
        IWeapon sword1 = traider.getWeapon(Weapons.SWORD);
        Recruit recruit1 = new Recruit();
        //System.out.println(recruit1.attack());
        //Paladin paladin = new Paladin(sword1,recruit1);
        //System.out.println(paladin.attack());

        System.out.println("=========================");

        IWeapon knife1 = traider.getWeapon(Weapons.KNIFE);
        IArmor liteArmor = traider.getArmor(Armor.LITEARMOR);
        Recruit recruit2 = new Recruit();
        IArmor mediumArmor = traider.getArmor(Armor.MEDIUMARMOR);
        Assassin assasin1 = new Assassin(knife1,liteArmor,recruit2,new BackStab());
        //System.out.println(assasin1.attack());
        //assasin1.useSkill();
        //Assassin assasin2 = new Assassin(sword1,mediumArmor,recruit1,new Inviz());
        //assasin2.useSkill();
        System.out.println(assasin1.dexterity());


    }
}
