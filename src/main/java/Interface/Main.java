package Interface;

import DAL.Repository.ArmorRepository;
import DAL.Repository.WeaponRepository;
import Logic.Battlefield.WarriorTask;
import Logic.Entities.Armor.Armor;
import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Armor.IArmor;
import Logic.Entities.Character.Class.Assassin;
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
       Assassin assassin1 = new Assassin("Мужик слева", traider.getWeapon(WeaponType.SWORD), traider.getArmor(ArmorType.LITEARMOR), recruit2,new BackStab());
       Assassin assassin2 = new Assassin("Мужик справа", traider.getWeapon(WeaponType.KNIFE), traider.getArmor(ArmorType.HARDARMOR), recruit1,new BackStab());
        System.out.println(assassin1.dexterity() + " " + assassin1.protection() + " " + assassin1.currentHealth());
        System.out.println(assassin2.dexterity() + " " + assassin2.protection() + " " + assassin2.currentHealth());
        WarriorTask warrior1 = new WarriorTask(assassin1,assassin2);
        WarriorTask warrior2 = new WarriorTask(assassin2,assassin1);

//
        Timer timer = new Timer();
        timer.schedule(warrior1, 0,10);
        timer.schedule(warrior2,0,10);

        do{

        }while (assassin1.isAlive() && assassin2.isAlive());
        System.out.println("конец");
        timer.cancel();
    }
    }

