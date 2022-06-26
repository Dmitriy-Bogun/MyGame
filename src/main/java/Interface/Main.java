package Interface;

import DAL.Repository.ArmorRepository;
import DAL.Repository.WeaponRepository;
import Logic.Battlefield.WarriorTask;
import Logic.Entities.Armor.Armor;
import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Armor.IArmor;
import Logic.Entities.BattleStrategies.ExorcistStrategy;
import Logic.Entities.BattleStrategies.RobberStrategy;
import Logic.Entities.BattleStrategies.ShadowAssassinStrategy;
import Logic.Entities.Character.Class.Assassin;
import Logic.Entities.Character.Class.Paladin;
import Logic.Entities.Character.Recruit;
import Logic.Entities.Skill.BackStab;
import Logic.Entities.Traider;
import Logic.Entities.Weapon.IWeapon;
import Logic.Entities.Weapon.WeaponType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        Traider traider = new Traider(new ArmorRepository(), new WeaponRepository());
//        System.out.println(traider.getArmor(ArmorType.LITEARMOR).getName());
//           System.out.println(traider.getWeapon(WeaponType.SWORD).getName());


//        context.getTransaction().begin();
//        context.persist(t1);
//               context.getTransaction().commit();
//
//        IWeapon knife1 = traider.getWeapon(WeaponType.KNIFE);
//        IArmor liteArmor = traider.getArmor(ArmorType.LITEARMOR);

       Recruit recruit1 = new Recruit();
       Recruit recruit2 = new Recruit();
//
       Assassin assassin = new Assassin("Ассассин", traider.getWeapon(WeaponType.KNIFE), traider.getArmor(ArmorType.LITEARMOR), recruit2, new ShadowAssassinStrategy());
       Paladin paladin = new Paladin("Паладин", traider.getWeapon(WeaponType.SWORD), traider.getArmor(ArmorType.HARDARMOR), recruit1, new ExorcistStrategy());
        System.out.println(assassin.dexterity() + " " + assassin.protection() + " " + assassin.currentHealth());
        System.out.println(paladin.dexterity() + " " + paladin.protection() + " " + paladin.currentHealth());
        WarriorTask warrior1 = new WarriorTask(assassin, paladin);
        WarriorTask warrior2 = new WarriorTask(paladin, assassin);

//
        Timer timer = new Timer();
        timer.schedule(warrior1, 0,10);
        timer.schedule(warrior2,0,10);

        do{

        }while (assassin.isAlive() && paladin.isAlive());
        System.out.println("конец");
        timer.cancel();
    }
    }

