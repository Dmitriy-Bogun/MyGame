package Logic.Entities;

import DAL.Repository.ArmorRepository;
import DAL.Repository.WeaponRepository;
import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;

import java.util.List;
import java.util.Random;

public class Traider {
    ArmorRepository armorRepository;
    WeaponRepository weaponRepository;
    Random random;
    public Traider(ArmorRepository armorRepository,WeaponRepository weaponRepository){
        this.armorRepository = armorRepository;
        this.weaponRepository = weaponRepository;
        random = new Random();
    }

    public IWeapon getWeapon(WeaponType type){
        List<Weapon> weapons = weaponRepository.requestWeapon(type);
        return weapons.get(random.nextInt(weapons.size()));
    }
    public Armor getArmor(ArmorType type){
        List<Armor> armors = armorRepository.requestArmor(type);
        return armors.get(random.nextInt(armors.size()));
    }
    //public static void showUniform(){

}
