package Interface;

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
        Recruit recruit2 = new Recruit();
        Assasin assasin1 = new Assasin(knife1,recruit2,new BackStab());
        System.out.println(assasin1.attack());
        assasin1.useSkill();
        Assasin assasin2 = new Assasin(sword1,recruit1,new Inviz());
        assasin2.useSkill();


    }
}
