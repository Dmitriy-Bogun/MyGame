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
        IWeapon knife1 = traider.getWeapon(WeaponType.KNIFE);

        IArmor liteArmor = traider.getArmor(ArmorType.LITEARMOR);
        IArmor mediumArmor = traider.getArmor(ArmorType.MEDIUMARMOR);

        Recruit recruit1 = new Recruit();
        Recruit recruit2 = new Recruit();

        Assassin assassin1 = new Assassin(knife1,liteArmor,recruit2,new BackStab());
        Assassin assassin2 = new Assassin(sword1,mediumArmor,recruit1,new Inviz());

//        int damage1 = assassin1.attack();
//        System.out.println(damage1);
//        assassin2.takingDamage(damage1);
//        System.out.println(assassin2.currentHealth());
//        if (assassin2.isAlive()){
//            int damage2 = assassin2.attack();
//            System.out.println(damage2);
//            assassin1.takingDamage(damage2);
//            System.out.println(assassin1.isAlive());
//            System.out.println(assassin1.currentHealth());
//        }
//        else System.out.println("assassin2 dead");

        System.out.println(assassin1.currentHealth());
        System.out.println(assassin2.currentHealth());
        System.out.println(assassin1.protection());
        System.out.println(assassin2.protection());
        assassin1.takingDamage(100);
        assassin2.takingDamage(100);
        System.out.println(assassin1.currentHealth());
        System.out.println(assassin2.currentHealth());
    }
}
